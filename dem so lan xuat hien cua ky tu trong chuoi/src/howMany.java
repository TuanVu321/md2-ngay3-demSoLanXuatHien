import java.util.Scanner;

public class howMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap vao 1 chuoi");
        String text = scanner.nextLine();
        System.out.println("nhap ky tu muon kiem tra");
        String check = scanner.nextLine();
        int count = 0;
        for(int i=0;i<text.length();i++){
            if((int)text.charAt(i)==(int)check.charAt(0)){
                count++;
            }
        }
        System.out.println("so lan xuat hien cua "+check+" la: "+count);
    }
}
