package BMS.Operation;

import BMS.BookList;

public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借书");
    }
}
