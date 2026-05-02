package com.transaction;

import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.runtime.*;
import java.util.*;

@DesignerComponent(
    version = 1,
    description = "Transaction Extension",
    category = ComponentCategory.EXTENSION,
    nonVisible = true,
    iconName = ""
)

@SimpleObject(external = true)
public class TransactionExtension extends AndroidNonvisibleComponent {

    private List<String> transactions = new ArrayList<>();

    public TransactionExtension(ComponentContainer container) {
        super(container.$form());
    }

    @SimpleFunction(description = "Add Transaction")
    public void AddTransaction(String title, String amount, String status, String date) {
        String data = title + "|" + amount + "|" + status + "|" + date;
        transactions.add(data);
    }

    @SimpleFunction(description = "Get Transactions")
    public List<String> GetTransactions() {
        return transactions;
    }

    @SimpleFunction(description = "Clear Transactions")
    public void ClearTransactions() {
        transactions.clear();
    }
}
