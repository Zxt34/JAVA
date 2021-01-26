package BMS.Operation;

import BMS.BookList;

public class SearchOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找书籍");
    }
}
