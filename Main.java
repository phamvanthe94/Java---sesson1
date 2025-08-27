// Bài tập 1:In ra dòng chữ ' Hello Word '
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello World");
//    }
//}

// Bài tập 2: Hiển thị tên và tuổi ra màn hình

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Nhập vào tên của bạn");
//        String name = input.nextLine();
//        System.out.println("Nhập vào tuổi của bạn:");
//        int age = Integer.parseInt(input.nextLine());
//        System.out.println("Nhập vào địa chỉ của bạn");
//        String address = input.nextLine();
//
//        System.out.printf("Tên tôi là: %s, tôi %d tuổi, hiện tại đang học tại PTIT-HCM , Quê quán ở %s", name, age, address);
//
//    }
//}


//Bài tập 3:Tính diện tích hình tròn
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        B1: Cho người dùng nhập vào bán kính hình tròn
//        System.out.println("Nhập bán kính hình tròn:");
//        double radius = Float.parseFloat(input.nextLine());
//
//        // B3: Khởi tạo công thức tính diện tích hình tròn
//        double area = Math.PI * radius * radius ;
//         B4: In ra màn hình diện tích hình tròn
//        System.out.printf("Diện tích hình tròn : %.2f",area);
//    }
//}

// Bai 4:  Toán tử số học
//Khai báo 2 biến kiểu số nguyên int và gán giá trị :
//Khai báo hai số nguyên a và b có kiểu int.
//Khởi tạo các giá trị bất kỳ cho 2 biến
//Thực hiện các phép toán:
//Tính tổng của a và b và gán cho .
//Tính hiệu của a và b.
//Tính tích của a và b.
//Tính thương của a chia cho b.
//Tính phần dư khi chia a cho b.
//In giá trị 2 biến a, b và kết quả các phép tính ra màn hình .


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Nhập vào số a:");
//        int a = Integer.parseInt(input.nextLine());
//        System.out.println("Nhập vào số a:");
//        int b = Integer.parseInt(input.nextLine());
//        int sum = a + b;
//        int diff = a - b;
//        int mult = a * b;
//        int div = a / b;
//        int mod = a % b;
//
//        System.out.printf("a = %d và b = %d%n",a,b);
//        System.out.printf("Tổng 2 số a + b = %d%n",sum);
//        System.out.printf("Hiệu 2 số a - b = %d%n",diff);
//        System.out.printf("Tích 2 số a * b = %d%n",mult);
//        System.out.printf("Thương 2 số a / b = %d%n",div);
//        System.out.printf("Số dư khi chia số  a cho b = %d%n",mod);
//    }
//}

// Bài 5: Tính tổng hai phân số

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Nhập tử số phân số 1:");
//        double a = Double.parseDouble(input.nextLine());
//        System.out.println("Nhập mẫu số phân số 2:");
//        double b = Double.parseDouble(input.nextLine());
//
//        System.out.println("Nhập tử số phân số 1:");
//        double c = Double.parseDouble(input.nextLine());
//        System.out.println("Nhập mẫu số phân số 2:");
//        double d = Double.parseDouble(input.nextLine());
//
//        double fraction1 = a / b;
//        double fraction2 = c / d;
//
//        System.out.printf("Phân số 1 : %.0f/%.0f%n", a, b);
//        System.out.printf("Phân số 2 : %.0f/%.0f%n", c,d);
//
//       double sumNumerator = a*d + b*c;
//       double sumDenominator = b*d;
//
//        System.out.printf("Tổng hai phân số : %.0f/%.0f%n", sumNumerator, sumDenominator );
//
//}
//}

// Bài 6:  Tính diện tích và chu vi của hình chữ nhật

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập chiều rộng :");
        float width = Float.parseFloat(input.nextLine());
        System.out.println("Nhập chiều cao :");
        float height = Float.parseFloat(input.nextLine());

        float area = width * height;
        float circumference = (width + height) *2;

        System.out.printf("Diện tích của hình chữ nhật là :%.2f%n",area);
        System.out.printf("Chu vi của hình chữ nhật là :%.2f",circumference);
    }
}