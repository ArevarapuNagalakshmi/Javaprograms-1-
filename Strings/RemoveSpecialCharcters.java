package Strings;

public class RemoveSpecialCharcters {
    public static void main(String[] args) {

            String st = "Pro@st#ack9191";

            String result = st.replaceAll("[^a-zA-Z0-9 ]", "");

            System.out.println("Original String: " +st);
            System.out.println("String after removing special characters: " + result);
        }
    }

