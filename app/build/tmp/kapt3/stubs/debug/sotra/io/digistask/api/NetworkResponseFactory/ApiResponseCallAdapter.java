package sotra.io.digistask.api.NetworkResponseFactory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022 \u0012\u0004\u0012\u0002H\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00060\u00050\u0004B!\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00010\n\u00a2\u0006\u0002\u0010\fJ(\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lsotra/io/digistask/api/NetworkResponseFactory/ApiResponseCallAdapter;", "S", "", "E", "Lretrofit2/CallAdapter;", "Lretrofit2/Call;", "Lsotra/i/chachingdemo/api/ApiResponse;", "successType", "Ljava/lang/reflect/Type;", "errorBodyConverter", "Lretrofit2/Converter;", "Lokhttp3/ResponseBody;", "(Ljava/lang/reflect/Type;Lretrofit2/Converter;)V", "adapt", "call", "responseType", "app_debug"})
public final class ApiResponseCallAdapter<S extends java.lang.Object, E extends java.lang.Object> implements retrofit2.CallAdapter<S, retrofit2.Call<sotra.i.chachingdemo.api.ApiResponse<? extends S, ? extends E>>> {
    private final java.lang.reflect.Type successType = null;
    private final retrofit2.Converter<okhttp3.ResponseBody, E> errorBodyConverter = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.reflect.Type responseType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public retrofit2.Call<sotra.i.chachingdemo.api.ApiResponse<S, E>> adapt(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<S> call) {
        return null;
    }
    
    public ApiResponseCallAdapter(@org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type successType, @org.jetbrains.annotations.NotNull()
    retrofit2.Converter<okhttp3.ResponseBody, E> errorBodyConverter) {
        super();
    }
}