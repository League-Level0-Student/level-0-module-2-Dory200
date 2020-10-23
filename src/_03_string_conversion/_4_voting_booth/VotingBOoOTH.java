package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBOoOTH {
	public static void main(String[] args) {
		String old = JOptionPane.showInputDialog("how old r u");
		int age = Integer.parseInt(old);
		if(age > 17) {
			JOptionPane.showInputDialog("who should the next president be");
		}
		if(age < 18) {
			JOptionPane.showMessageDialog(null, "no one cares");
		
			}
		
		}
	}
