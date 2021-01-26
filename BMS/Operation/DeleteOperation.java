package BMS.Operation;

import BMS.BookList;

public class DeleteOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
    }
}
