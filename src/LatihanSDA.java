public class LatihanSDA {
    public static void main(String[] args) {
        int avg;
        System.out.println("Hello world!");
        //avg = findAVG(1,2,3);

        Soal soal = new Soal();

        String name = "ahmad jaelani sidiq";

        String[] s = name.split(" ");

        System.out.println(soal.findAVG(1,2,3));
        System.out.println(name);

        StringBuilder builder = new StringBuilder();
        String username;
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
            builder.append(s[i]+" ");
        }
        username = builder.toString();
        System.out.println(s);
        System.out.println(username);

        System.out.println();



    }

}
