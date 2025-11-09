class CommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        StringBuilder str = new StringBuilder();

        for(int i=0; i<strs[0].length(); i++)
        {
            char c = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++)
            {

                if(i >= strs[j].length() || strs[j].charAt(i) != c)
                {
                    return str.toString();

                }
            }
            str.append(c);
        }
        return str.toString();

    }


    static void main()
    {
        String[] strs = {"flower", "fly", "flesh"};
        System.out.println(CommonPrefix.longestCommonPrefix(strs));

    }
}