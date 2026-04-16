    package org.example;

    import java.util.Locale;
    import java.util.Scanner;

    public class StringNomalization {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao chuoi ban muon chuan hoa: ");
            String str = sc.nextLine();

            //loai bo cac khoang trang du thua. Moi tu cach nhau 1 khoang trang
            //Regex tim cac dau nhu : , ; . va them khoang cach vac sau no
            String handleSpecial = str.replaceAll("([:,;.])", "$1 ");
            // \\s+ tim tat ca cac khoang cach, tab, xuong dong
            String cleanStr = handleSpecial.trim().replaceAll("\\s+", " ");

            //tach cac tu trong chuoi ra de xu ly viet hoa
            String[] words = cleanStr.split(" ");
            StringBuilder result = new StringBuilder();

            for (String w : words) {
                //chi xu ly neu 'w' khong bi rong
                if (!w.isEmpty()) {
                    String capitalizeWord = w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase();
                    result.append(capitalizeWord).append(" ");
                }
            }

    //        //C2: dung thu vien de viet hoa moi tu( chua cai thu vien -> de lan sau)
    //        String result = WordUtils.capitalizeFully(cleanStr);

            System.out.println("Chuoi goc la: " + str);
            System.out.println("Chuoi da chuan hoa la: " + result.toString().trim());
        }
    }
