public class ex {
    // can bac hai 
    public static double squareRoot(int number) {
        double temp;
 
        double sr = number / 2;
 
        do {
            temp = sr;
            sr = (temp + (number / temp)) / 2;
        } while ((temp - sr) != 0);
 
        return sr;
    }
    // de dung ham tren thi : squareRoot(num) voi num la tham so can giai
    public static void giaiPTBac2(float a, float b, float c) {
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        // tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }

    }
    // voi a,b,c float   ham in ket qua BaiTap1.giaiPTBac2(a, b, c);
    // trong do BaiTap1 la ten class 
    public boolean soHoanHao(int n)
    {
        int s=1;
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0) s+=i+(n/i);
        }
        if(n==s) return true;
        else return false;
    }
    // cach ap dung ham :
    public static void main(String[] args) {
        MathSubjects A = new MathSubjects();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        if(A.soHoanHao(n))
        {
            System.out.print(n+" là số hoàn hảo");
        }else {
            System.out.print(n+" không phải là số hoàn hảo");
        }
}
public static int fibonacci(int n) {
    int f0 = 0;
    int f1 = 1;
    int fn = 1;

    if (n < 0) {
        return -1;
    } else if (n == 0 || n == 1) {
        return n;
    } else {
        for (int i = 2; i < n; i++) {
            f0 = f1;
            f1 = fn;
            fn = f0 + f1;
        }
    }
    return fn;
}
// ap dung ham main
public static void Main_fake(){
    System.out.println("10 số đầu tiên của dãy số fibonacci: ");
    for (int i = 0; i < 10; i++) {
        System.out.print(fibonacci(i) + " ");
    }
}
// Tim vi tri phan tu trong mang 
public static void main_kake_two(String[] args) {
    int n, temp, max = 100, k, c, d, l;
    Scanner scanner = new Scanner(System.in);
         
    // khai báo và cấp phát bộ nhớ cho mảng A
    int array[] = new int[max];
         
    // nhập số phần tử của mảng
    // kiểm tra nếu n <= 0 hoặc n > max - 1
    // thì phải nhập lại
    do {
        System.out.println("Nhập số phần tử của mảng: ");
        n = scanner.nextInt();
    } while (n <= 0 || n > max-1);
         
    System.out.println("Nhập giá trị cho các phần tử của mảng: ");
    for (int i = 0; i < n; i++) {
        System.out.print("array[" + i + "] = ");
        array[i] = scanner.nextInt();
    }
         
    // sắp xếp tăng dần các phần tử bằng phương pháp Exchange sort
    // vòng lặp for sẽ duyệt i và j
    // i chạy từ 0 đến n - 1, j chay từ i + 1 đến n - 1
    // nếu phần tử tại chỉ số j nhỏ hơn phần tử tại i
    // thì sẽ hoán đổi vị trí 2 phần tử này cho nhau
    for (int i = 0; i < n - 1; i++) {
        for (int j = i+1; j <= n - 1; j++) {
            if (array[j] < array[i]) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }
         
    // tìm kiếm phần tử trong mảng
    System.out.println("Nhập số nguyên cần tìm: ");
    k = scanner.nextInt();
         
    d = 0;
    c = n - 1;
     
    // duyệt vòng lặp while
    // nếu d còn nhỏ hơn hoặc bằng c thì còn tiếp tục thực hiện thân vòng lặp
    while (d <= c) {
        l = (d + c) / 2;
             
        // nếu phần tử tại vị trí j bằng số nguyên k cần tìm
        // thì thông báo tìm thấy số k tại vị trí j
        // và kết thúc vòng lặp
        if (array[l] == k) {
            System.out.println("Tìm thấy phần tử " + k + " tại vị trí " + l);
            return; // kết thúc vòng lặp while và bỏ qua các lệnh bên dưới
        } else if (array[l] < k) {
            // nếu phần tử tại l nhỏ hơn số nguyên k
            // thì tăng d = l + 1
            // và quay lại thực hiện vòng lặp while
            d = l + 1;
        } else {
            // nếu phần tử tại l lớn hơn số nguyên k
            // thì giảm c = l - 1
            // và quay lại thực hiện vòng lặp while
            c = l - 1;
        }
    }
         
    // nếu sau khi thực hiện vòng lặp while
    // mà không tìm thấy số cần tìm
    // thì hiển thị thông báo không tìm thấy
    System.out.println("Trong mảng không có phần tử nào chứa giá trị cần tìm.");
}
}


