package Lab7;

public class Shop {
    private Product[] menu;
    private Order[] orders;
    private int nextOrderIndex;

    public Shop(Product[] menu){
        this.menu = menu;
        this.orders = new Order[1000];
        nextOrderIndex = 0;
    }

    public Product[] getMenu(){
        return menu;
    }

    public void printOrders(){
        for(int i = 0; i < nextOrderIndex; i++){
            System.out.println("#"+i+" "+orders[i].toString());
        }
    }

    //นำแต่ละproduct ที่อยู่ใน menu[] ไปเก็บที่ order[]
    public void placeOrder(int menuIndexId, int table){
        Product product = menu[menuIndexId];
        orders[nextOrderIndex] = new Order(table, product);
        nextOrderIndex++;
    }

    // เช็คว่าสั่งOrderไหนเสร็จให้เป็นtrue
    public void completeOrder(int orderNumber){
        for(int i = 0; i < nextOrderIndex; i++){
            // if(i == orderNumber){
            //     order[i].setComplete(true);
            // }
            orders[i].setComplete(i == orderNumber);
        }
    }
}
