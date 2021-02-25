package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0))+ word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.charAt(0)+ "." +lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        double x= (vatRate*originalPrice)/100;
        double total = originalPrice+x;
        return Double.parseDouble(String.format("%.2f", total));
    }

    public String reverse(String sentence) {
        String reversestr = new StringBuilder(sentence).reverse().toString();
        return reversestr;
    }

    public int countLinuxUsers(List<User> users) {
        int count = 0;

		for (int i = 0; i < users.size(); i++) {
			String operatingSystemName = users.get(i).getType();
			if (operatingSystemName.equalsIgnoreCase("Linux")) {
				count++;
			}
		}

		return count;
	}
    
}

