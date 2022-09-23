package Books;

import javax.swing.*;

public class Book {
        private String Title;

        private String ISBN;

        private Double Price;

        private Integer Pages;

        public Book() //This is your no argument Constructor
        {
            Title="Not Availble";
            ISBN="Not Availble";
            Price=0.0;
            Pages=0;
        }
        public Book(String Title, String ISBN, Double Price,Integer Pages)
        {
            this.Title=Title;
            this.ISBN=ISBN;
            this.Price=Price;
            this.Pages=Pages;
        }
        public String getTitle()
        {
            return Title;
        }
        public String getISBN()
        {
            return ISBN;
        }
        public Double getPrice()
        {
            return Price;
        }
        public Integer getPages()
        {
            return Pages;
        }
        public void setTitle (String Title){this.Title=Title;}
        public void setISBN (String ISBN){this.ISBN=ISBN;}
        public void setPrice(Double price){this.Price=Price;}
        public void setPages(Integer pages){this.Pages=pages;}

    public String toString() {
        return "Title: " + getTitle() + "\nISBN: " + getISBN() + "\nPrice: €" + getPrice() + "\nPages: " + getPages();
    }


}
