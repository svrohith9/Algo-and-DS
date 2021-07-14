package com.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ComparatorBasedPagination {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numOfItems = 5;// sc.nextInt();

		List<Item> data = new ArrayList<>();
		data.add(new Item("item5", 12, 9));
		data.add(new Item("item4", 99, 6));
		data.add(new Item("item1", 10, 15));
		data.add(new Item("item2", 3, 4));
		data.add(new Item("item3", 17, 8));

		// 0,1,2 based on the field index
		int sortParameter = 0;// sc.nextInt();
		// 0 ascending, 1 descending
		int sortOrder = 0;// sc.nextInt();
		int itemsPerPage = 2;// sc.nextInt();
		int pageNumber = 2;// sc.nextInt();

		ItemSort sorter = new ItemSort();
		if (sortParameter == 0)
			data = sorter.sortByName(data, sortOrder);
		else if (sortParameter == 1)
			data = sorter.sortByPrice(data, sortOrder);
		else
			data = sorter.sortByRelevance(data, sortOrder);

//
//			data.sort((Item i1, Item i2) -> i1.getName().compareTo(i2.getName())); 
//
//			data.sort((Item i1, Item i2) -> Integer.compare(i1.getRelevance(), i2.getRelevance()));
//
//			data.sort((Item i1, Item i2) -> Integer.compare(i1.getPrice(), i2.getPrice())); 
//		

		int data_split = itemsPerPage * pageNumber;

		data.stream().limit(itemsPerPage + data_split).skip(data_split).forEach(item -> {
			System.out.println(item);
		});

		System.out.println(data.toString());
	}
}

class Item {
	String name;
	int relevance;
	int price;

	public Item(String name, int relevance, int price) {
		this.name = name;
		this.relevance = relevance;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", relevance=" + relevance + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRelevance() {
		return relevance;
	}

	public void setRelevance(int relevance) {
		this.relevance = relevance;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

class ItemSort {

	public List<Item> sortByName(List<Item> ItemList, int order) {

		Collections.sort(ItemList, new Comparator<Item>() {

			@Override
			public int compare(Item Item1, Item Item2) {
				if (order == 0)
					return Item1.getName().compareTo(Item2.getName());
				return Item2.getName().compareTo(Item1.getName());
			}

		});
		return ItemList;
	}

	public List<Item> sortByRelevance(List<Item> ItemList, int order) {

		Collections.sort(ItemList, new Comparator<Item>() {

			@Override
			public int compare(Item Item1, Item Item2) {
				if (order == 0)
					return Item1.getRelevance() - Item2.getRelevance();
				return Item2.getRelevance() - Item1.getRelevance();
			}

		});
		return ItemList;
	}

	public List<Item> sortByPrice(List<Item> ItemList, int order) {

		Collections.sort(ItemList, new Comparator<Item>() {

			@Override
			public int compare(Item Item1, Item Item2) {
				if (order == 0)
					return Item1.getPrice() - Item2.getPrice();
				return Item2.getPrice() - Item1.getPrice();
			}

		});
		return ItemList;
	}
}
