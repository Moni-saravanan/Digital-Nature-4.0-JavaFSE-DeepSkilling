public class BubbleSort {
    public static void sort(Order[] orders) {
        int n=orders.length;
        for (int i=0;i<n-1;i++) {
            for (int j=0;j<n-i-1;j++) {
                if(orders[j].totalPrice>orders[j+1].totalPrice){
                    Order temp=orders[j];
                    orders[j]=orders[j+1];
                    orders[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++) {
            System.out.print("Order Id: "+orders[i].OrderId+"   Order name: "+orders[i].OrderName+"   Total Price\n");
        }
    }
}
