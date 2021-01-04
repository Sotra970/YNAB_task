package sotra.ynab.data.transaction;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@android.annotation.SuppressLint(value = {"ParcelCreator"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bH\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00a3\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u001aJ\t\u0010I\u001a\u00020\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\u0003H\u00c6\u0003J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0003H\u00c6\u0003J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\t\u0010O\u001a\u00020\u0003H\u00c6\u0003J\t\u0010P\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u00c6\u0003J\t\u0010R\u001a\u00020\u0003H\u00c6\u0003J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\u0003H\u00c6\u0003J\t\u0010U\u001a\u00020\u0006H\u00c6\u0003J\t\u0010V\u001a\u00020\bH\u00c6\u0003J\t\u0010W\u001a\u00020\u0003H\u00c6\u0003J\t\u0010X\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0003H\u00c6\u0003J\t\u0010[\u001a\u00020\bH\u00c6\u0003J\u00cd\u0001\u0010\\\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u0003H\u00c6\u0001J\t\u0010]\u001a\u00020\u0006H\u00d6\u0001J\u0013\u0010^\u001a\u00020\b2\b\u0010_\u001a\u0004\u0018\u00010`H\u00d6\u0003J\t\u0010a\u001a\u00020\u0006H\u00d6\u0001J\t\u0010b\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020\u0006H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR\u001a\u0010\r\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010&\"\u0004\b2\u0010(R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001c\"\u0004\b8\u0010\u001eR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001c\"\u0004\b:\u0010\u001eR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001c\"\u0004\b<\u0010\u001eR\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001c\"\u0004\b>\u0010\u001eR\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001c\"\u0004\b@\u0010\u001eR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u001c\"\u0004\bF\u0010\u001eR\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u001c\"\u0004\bH\u0010\u001e\u00a8\u0006h"}, d2 = {"Lsotra/ynab/data/transaction/Transaction;", "Landroid/os/Parcelable;", "account_id", "", "account_name", "amount", "", "approved", "", "category_id", "category_name", "cleared", "date", "deleted", "flag_color", "id", "import_id", "matched_transaction_id", "memo", "payee_id", "payee_name", "subtransactions", "", "Lsotra/ynab/data/transaction/Subtransaction;", "transfer_account_id", "transfer_transaction_id", "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAccount_id", "()Ljava/lang/String;", "setAccount_id", "(Ljava/lang/String;)V", "getAccount_name", "setAccount_name", "getAmount", "()I", "setAmount", "(I)V", "getApproved", "()Z", "setApproved", "(Z)V", "getCategory_id", "setCategory_id", "getCategory_name", "setCategory_name", "getCleared", "setCleared", "getDate", "setDate", "getDeleted", "setDeleted", "getFlag_color", "setFlag_color", "getId", "setId", "getImport_id", "setImport_id", "getMatched_transaction_id", "setMatched_transaction_id", "getMemo", "setMemo", "getPayee_id", "setPayee_id", "getPayee_name", "setPayee_name", "getSubtransactions", "()Ljava/util/List;", "setSubtransactions", "(Ljava/util/List;)V", "getTransfer_account_id", "setTransfer_account_id", "getTransfer_transaction_id", "setTransfer_transaction_id", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class Transaction implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String account_id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String account_name;
    private int amount;
    private boolean approved;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String category_id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String category_name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String cleared;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String date;
    private boolean deleted;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String flag_color;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String import_id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String matched_transaction_id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String memo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String payee_id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String payee_name;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<sotra.ynab.data.transaction.Subtransaction> subtransactions;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String transfer_account_id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String transfer_transaction_id;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccount_id() {
        return null;
    }
    
    public final void setAccount_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccount_name() {
        return null;
    }
    
    public final void setAccount_name(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getAmount() {
        return 0;
    }
    
    public final void setAmount(int p0) {
    }
    
    public final boolean getApproved() {
        return false;
    }
    
    public final void setApproved(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCategory_id() {
        return null;
    }
    
    public final void setCategory_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCategory_name() {
        return null;
    }
    
    public final void setCategory_name(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCleared() {
        return null;
    }
    
    public final void setCleared(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getDeleted() {
        return false;
    }
    
    public final void setDeleted(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFlag_color() {
        return null;
    }
    
    public final void setFlag_color(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImport_id() {
        return null;
    }
    
    public final void setImport_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMatched_transaction_id() {
        return null;
    }
    
    public final void setMatched_transaction_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMemo() {
        return null;
    }
    
    public final void setMemo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPayee_id() {
        return null;
    }
    
    public final void setPayee_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPayee_name() {
        return null;
    }
    
    public final void setPayee_name(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<sotra.ynab.data.transaction.Subtransaction> getSubtransactions() {
        return null;
    }
    
    public final void setSubtransactions(@org.jetbrains.annotations.NotNull()
    java.util.List<sotra.ynab.data.transaction.Subtransaction> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransfer_account_id() {
        return null;
    }
    
    public final void setTransfer_account_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransfer_transaction_id() {
        return null;
    }
    
    public final void setTransfer_transaction_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Transaction(@org.jetbrains.annotations.NotNull()
    java.lang.String account_id, @org.jetbrains.annotations.NotNull()
    java.lang.String account_name, int amount, boolean approved, @org.jetbrains.annotations.NotNull()
    java.lang.String category_id, @org.jetbrains.annotations.NotNull()
    java.lang.String category_name, @org.jetbrains.annotations.NotNull()
    java.lang.String cleared, @org.jetbrains.annotations.NotNull()
    java.lang.String date, boolean deleted, @org.jetbrains.annotations.NotNull()
    java.lang.String flag_color, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String import_id, @org.jetbrains.annotations.NotNull()
    java.lang.String matched_transaction_id, @org.jetbrains.annotations.NotNull()
    java.lang.String memo, @org.jetbrains.annotations.NotNull()
    java.lang.String payee_id, @org.jetbrains.annotations.NotNull()
    java.lang.String payee_name, @org.jetbrains.annotations.NotNull()
    java.util.List<sotra.ynab.data.transaction.Subtransaction> subtransactions, @org.jetbrains.annotations.NotNull()
    java.lang.String transfer_account_id, @org.jetbrains.annotations.NotNull()
    java.lang.String transfer_transaction_id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    public final boolean component9() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<sotra.ynab.data.transaction.Subtransaction> component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final sotra.ynab.data.transaction.Transaction copy(@org.jetbrains.annotations.NotNull()
    java.lang.String account_id, @org.jetbrains.annotations.NotNull()
    java.lang.String account_name, int amount, boolean approved, @org.jetbrains.annotations.NotNull()
    java.lang.String category_id, @org.jetbrains.annotations.NotNull()
    java.lang.String category_name, @org.jetbrains.annotations.NotNull()
    java.lang.String cleared, @org.jetbrains.annotations.NotNull()
    java.lang.String date, boolean deleted, @org.jetbrains.annotations.NotNull()
    java.lang.String flag_color, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String import_id, @org.jetbrains.annotations.NotNull()
    java.lang.String matched_transaction_id, @org.jetbrains.annotations.NotNull()
    java.lang.String memo, @org.jetbrains.annotations.NotNull()
    java.lang.String payee_id, @org.jetbrains.annotations.NotNull()
    java.lang.String payee_name, @org.jetbrains.annotations.NotNull()
    java.util.List<sotra.ynab.data.transaction.Subtransaction> subtransactions, @org.jetbrains.annotations.NotNull()
    java.lang.String transfer_account_id, @org.jetbrains.annotations.NotNull()
    java.lang.String transfer_transaction_id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}