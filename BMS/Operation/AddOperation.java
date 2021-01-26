package BMS.Operation;

import BMS.BookList;

public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("新增书籍");
    }
}
