package GeeksforGeeks.Basic_Problems;

//Swap Two Numbers Without Using Third Variable
//https://www.geeksforgeeks.org/swap-two-numbers-without-using-temporary-variable/
public class SwapWithoutThirdVariable {

    public static void main(String[] args) {

        int a = 5, b = 10;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a + b; //Tính tổng và lưu vào. Thực hiện a = 5 + 10 = 15, bây giờ a = 15, b = 10
        b = a - b; //Lấy tổng trừ đi giá trị ban đầu của b, lưu vào b. Thực hiện b = 15 - 10 = 5, bây giờ a = 15, b = 5
        a = a - b; //Lấy tổng trừ đi giá trị mới của b, lưu vào a. Thực hiện a = 15 - 5 = 10, bây giờ a = 10, b = 5

        System.out.println("After swap: a = " + a + ", b = " + b);
    }

}
