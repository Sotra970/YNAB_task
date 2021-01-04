package sotra.ynab.util.dialog;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001d\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0015J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\u0016\u0010\u001d\u001a\u00020\u00112\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007J\u0016\u0010\u001e\u001a\u00020\u00112\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005J\b\u0010\u001f\u001a\u00020\u0011H\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006!"}, d2 = {"Lsotra/ynab/util/dialog/GenericDialogFragment;", "T", "Landroidx/fragment/app/DialogFragment;", "()V", "addressListClickListener", "Lsotra/ynab/util/dialog/GenericDialogFragment$GenricDialogFragmentClickListener;", "data", "", "genericDialogArrayAdapter", "Lsotra/ynab/util/dialog/GenricDialogArrayAdapter;", "listView", "Landroidx/recyclerview/widget/RecyclerView;", "getListView", "()Landroidx/recyclerview/widget/RecyclerView;", "setListView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "GenericDrawText", "", "textView", "Landroid/widget/TextView;", "item", "(Landroid/widget/TextView;Ljava/lang/Object;)V", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "onStart", "setData", "setListItemClickListener", "setup", "GenricDialogFragmentClickListener", "app_debug"})
public abstract class GenericDialogFragment<T extends java.lang.Object> extends androidx.fragment.app.DialogFragment {
    private java.util.List<? extends T> data;
    private sotra.ynab.util.dialog.GenericDialogFragment.GenricDialogFragmentClickListener<T> addressListClickListener;
    @org.jetbrains.annotations.Nullable()
    private androidx.recyclerview.widget.RecyclerView listView;
    private sotra.ynab.util.dialog.GenricDialogArrayAdapter<T> genericDialogArrayAdapter;
    private java.util.HashMap _$_findViewCache;
    
    public final void setListItemClickListener(@org.jetbrains.annotations.Nullable()
    sotra.ynab.util.dialog.GenericDialogFragment.GenricDialogFragmentClickListener<T> addressListClickListener) {
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends T> data) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.recyclerview.widget.RecyclerView getListView() {
        return null;
    }
    
    public final void setListView(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    public abstract void GenericDrawText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, T item);
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setup() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    public GenericDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lsotra/ynab/util/dialog/GenericDialogFragment$GenricDialogFragmentClickListener;", "T", "", "onGenericDialogItemClicked", "", "child", "(Ljava/lang/Object;)V", "app_debug"})
    public static abstract interface GenricDialogFragmentClickListener<T extends java.lang.Object> {
        
        public abstract void onGenericDialogItemClicked(T child);
    }
}