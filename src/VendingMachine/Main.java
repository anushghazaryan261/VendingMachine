package VendingMachine;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine=new VendingMachine();

        //region Creating Products
        LinkedList<Product> fantas=new LinkedList<Product>();
        for(int i=0;i<10;i++){
            Fanta fanta=new Fanta();
            fantas.add(fanta);
        }

        LinkedList<Product> pepsies=new LinkedList<Product>();
        for(int i=0;i<10;i++){
            Product pepsi=new Pepsi();
            pepsies.add(pepsi);
        }

        LinkedList<Product> colas=new LinkedList<Product>();
        for(int i=0;i<10;i++){
            Cola cola=new Cola();
            colas.add(cola);
        }

        LinkedList<Product> lays=new LinkedList<Product>();
        for(int i=0;i<10;i++){
            Lays layss=new Lays();
            lays.add(layss);
        }
        LinkedList<Product> doritos=new LinkedList<Product>();
        for(int i=0;i<10;i++){
            Doritos dori=new Doritos();
            doritos.add(dori);
        }

        LinkedList<Product> hzorChips=new LinkedList<Product>();
        for(int i=0;i<10;i++){
            HzorChips hzorChips1=new HzorChips();
            hzorChips.add(hzorChips1);
        }

        LinkedList<Product> bounties=new LinkedList<Product>();
        for(int i=0;i<10;i++){
            Bounty bounty=new Bounty();
            bounties.add(bounty);
        }

        LinkedList<Product> marses=new LinkedList<Product>();
        for(int i=0;i<10;i++){
            Mars mars=new Mars();
            marses.add(mars);
        }

        LinkedList<Product> snickers=new LinkedList<Product>();
        for(int i=0;i<10;i++){
            Snickers snickers1=new Snickers();
            snickers.add(snickers1);
        }

        //endregion
        HashMap<Character,LinkedList<Product>> productsInFirstColumn=new HashMap<>();
        productsInFirstColumn.put('A',pepsies);
        productsInFirstColumn.put('B',lays);
        productsInFirstColumn.put('C',marses);

        HashMap<Character,LinkedList<Product>> productsInSecondColumn=new HashMap<>();
        productsInSecondColumn.put('A',colas);
        productsInSecondColumn.put('B',doritos);
        productsInSecondColumn.put('C',bounties);

        HashMap<Character,LinkedList<Product>> productsInThirdColumn=new HashMap<>();
        productsInThirdColumn.put('A',fantas);
        productsInThirdColumn.put('B',hzorChips);
        productsInThirdColumn.put('C',bounties);

        vendingMachine.setProductsInTheFirstColumn(productsInFirstColumn);
        vendingMachine.setProductsInTheSecondColumn(productsInSecondColumn);
        vendingMachine.setProductsInTheThirdColumn(productsInThirdColumn);


        Scanner sc=new Scanner(System.in);
        System.out.println("Please input the command---");
        String input=sc.nextLine();
        Command command=Converter.convertInputToCommand(input);



        System.out.println("wanted product is---" + vendingMachine.getProductByCommand(command));




    }
}
