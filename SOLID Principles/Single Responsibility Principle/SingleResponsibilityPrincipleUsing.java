package com.keyword;

class SalesOrders          // Each classes containing their own functions.This follows Single Responsibility Principle.
{
    public void salesOrder()
    {
        System.out.println("Sales Order.");
    }

}

class SaveOrders
{
    public void saveOrder()
    {
        System.out.println("Save Order.");
    }
}
class ExportOrders
{
    public void exportOrdersInXML()
    {
        System.out.println("Export Order in XML.");
    }
    public void exportOrdersInCSV()
    {
        System.out.println("Export Order in CSV.");
    }
}


public class SingleResponsibilityPrincipleUsing
{
    public static void main(String[] args)
    {
        SalesOrders salesOrders = new SalesOrders();
        SaveOrders saveOrders = new SaveOrders();
        ExportOrders exportOrders = new ExportOrders();
        salesOrders.salesOrder();
        System.out.println("------------------------------");
        saveOrders.saveOrder();
        System.out.println("------------------------------");
        exportOrders.exportOrdersInXML();
        exportOrders.exportOrdersInCSV();
        System.out.println("------------------------------");
    }
}
