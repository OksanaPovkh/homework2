package homework3.task2;

public class OpenShop {
    public static void main(String[] args) {
//Создайте две переменные isEdekaOpen и isReweOpen,
        // значения которых зависят от того, открыты магазины или нет.
        // Реализует логический метод canBuy,, возвращающий true ** Значение этой переменной должно быть true,
        // если хотя бы один магазин открыт, иначе false. Отобразите строку «Я могу купить еду, это ……» и значение.
      boolean isEdekaOpen = false;
      boolean isReweOpen = true;
      boolean isCandy;
      if (isEdekaOpen || isReweOpen) {
          isCandy = true;
      }
        boolean isRewaOpen = false;
        Shop shop = new Shop(isEdekaOpen, isRewaOpen);
        String shopName = "";
       if (shop.canBuy()) {
            if (shop.isEdekaOpen && !shop.isRewaOpen) {
                shopName = "Edeka";
            } else if (!shop.isEdekaOpen && shop.isRewaOpen) {
                shopName = "Rewe";
            } else if (shop.isEdekaOpen && shop.isRewaOpen) {
                shopName = "Edeka или Rewe";
            }
           System.out.println("Я могу купить еду в " + shopName);
       } else {
            System.out.println("Я не могу купить еду ");


      }
}
     private static class Shop{
       private boolean isEdekaOpen;
       private boolean isRewaOpen;
    public Shop(boolean isEdekaOpen, boolean isRewaOpen) {
            this.isEdekaOpen = isEdekaOpen;
            this.isRewaOpen = isRewaOpen;
        }
    public boolean canBuy() {
           return isEdekaOpen || isRewaOpen;
        }


    }
}
      class Shop {
          private boolean isEdekaOpen;
          private boolean isRewaOpen;

          public Shop(boolean isEdekaOpen, boolean isRewaOpen) {
              this.isEdekaOpen = isEdekaOpen;
              this.isRewaOpen = isRewaOpen;
          }

          public boolean canBuy() {
              return isEdekaOpen || isRewaOpen;
          }
      }
