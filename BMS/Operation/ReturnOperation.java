package BMS.Operation;

import BMS.BookList;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还书籍");
    }
}
