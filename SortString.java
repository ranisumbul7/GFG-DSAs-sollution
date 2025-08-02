public static String sortDescending(String str) {
    char ch[] = str.toCharArray();
    Arrays.sort(ch);
    StringBuilder sb = new StringBuilder(String.valueOf(ch));
    return sb.reverse().toString();
}
