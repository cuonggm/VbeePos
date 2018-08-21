package com.vbee.vbeepos.util;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtil {

	public static <T> List<T> copyWithoutNullElements(List<T> list) {
		List<T> newList = new ArrayList<T>();
		for (T element : list) {
			if (element != null) {
				newList.add(element);
			}
		}
		return newList;
	}

}
