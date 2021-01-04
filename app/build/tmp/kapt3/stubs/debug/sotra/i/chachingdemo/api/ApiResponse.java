package sotra.i.chachingdemo.api;

import java.lang.System;

/**
 * Common class used by API responses.
 * @param <T> the type of the response object
 * </T>
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0001*\u00020\u00022\u00020\u0002:\u0006\u0005\u0006\u0007\b\t\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004\u0082\u0001\u0006\u000b\f\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lsotra/i/chachingdemo/api/ApiResponse;", "T", "", "U", "()V", "ApiError", "EmptyResponse", "Loading", "NetworkError", "Success", "UnknownError", "Lsotra/i/chachingdemo/api/ApiResponse$Success;", "Lsotra/i/chachingdemo/api/ApiResponse$ApiError;", "Lsotra/i/chachingdemo/api/ApiResponse$NetworkError;", "Lsotra/i/chachingdemo/api/ApiResponse$UnknownError;", "Lsotra/i/chachingdemo/api/ApiResponse$EmptyResponse;", "Lsotra/i/chachingdemo/api/ApiResponse$Loading;", "app_debug"})
public abstract class ApiResponse<T extends java.lang.Object, U extends java.lang.Object> {
    
    private ApiResponse() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003B\r\u0012\u0006\u0010\u0005\u001a\u00028\u0002\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\n\u001a\u00028\u0002H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u0002H\u00c6\u0001\u00a2\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0013\u0010\u0005\u001a\u00028\u0002\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lsotra/i/chachingdemo/api/ApiResponse$Success;", "T", "", "Lsotra/i/chachingdemo/api/ApiResponse;", "", "body", "(Ljava/lang/Object;)V", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lsotra/i/chachingdemo/api/ApiResponse$Success;", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends sotra.i.chachingdemo.api.ApiResponse {
        @org.jetbrains.annotations.NotNull()
        private final T body = null;
        
        @org.jetbrains.annotations.NotNull()
        public final T getBody() {
            return null;
        }
        
        public Success(@org.jetbrains.annotations.NotNull()
        T body) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final T component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final sotra.i.chachingdemo.api.ApiResponse.Success<T> copy(@org.jetbrains.annotations.NotNull()
        T body) {
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
    }
    
    /**
     * Failure response with body
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003B\u0017\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00018\u0002H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0007H\u00c6\u0003J*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0002\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lsotra/i/chachingdemo/api/ApiResponse$ApiError;", "U", "", "Lsotra/i/chachingdemo/api/ApiResponse;", "", "body", "code", "", "(Ljava/lang/Object;I)V", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getCode", "()I", "component1", "component2", "copy", "(Ljava/lang/Object;I)Lsotra/i/chachingdemo/api/ApiResponse$ApiError;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
    public static final class ApiError<U extends java.lang.Object> extends sotra.i.chachingdemo.api.ApiResponse {
        @org.jetbrains.annotations.Nullable()
        private final U body = null;
        private final int code = 0;
        
        @org.jetbrains.annotations.Nullable()
        public final U getBody() {
            return null;
        }
        
        public final int getCode() {
            return 0;
        }
        
        public ApiError(@org.jetbrains.annotations.Nullable()
        U body, int code) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final U component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        /**
         * Failure response with body
         */
        @org.jetbrains.annotations.NotNull()
        public final sotra.i.chachingdemo.api.ApiResponse.ApiError<U> copy(@org.jetbrains.annotations.Nullable()
        U body, int code) {
            return null;
        }
        
        /**
         * Failure response with body
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        /**
         * Failure response with body
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Failure response with body
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    /**
     * Network error
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lsotra/i/chachingdemo/api/ApiResponse$NetworkError;", "Lsotra/i/chachingdemo/api/ApiResponse;", "", "error", "Ljava/io/IOException;", "(Ljava/io/IOException;)V", "getError", "()Ljava/io/IOException;", "app_debug"})
    public static final class NetworkError extends sotra.i.chachingdemo.api.ApiResponse {
        @org.jetbrains.annotations.NotNull()
        private final java.io.IOException error = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.io.IOException getError() {
            return null;
        }
        
        public NetworkError(@org.jetbrains.annotations.NotNull()
        java.io.IOException error) {
            super();
        }
    }
    
    /**
     * For example, json parsing error
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lsotra/i/chachingdemo/api/ApiResponse$UnknownError;", "Lsotra/i/chachingdemo/api/ApiResponse;", "", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "app_debug"})
    public static final class UnknownError extends sotra.i.chachingdemo.api.ApiResponse {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Throwable error = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Throwable getError() {
            return null;
        }
        
        public UnknownError(@org.jetbrains.annotations.Nullable()
        java.lang.Throwable error) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lsotra/i/chachingdemo/api/ApiResponse$EmptyResponse;", "Lsotra/i/chachingdemo/api/ApiResponse;", "", "()V", "app_debug"})
    public static final class EmptyResponse extends sotra.i.chachingdemo.api.ApiResponse {
        public static final sotra.i.chachingdemo.api.ApiResponse.EmptyResponse INSTANCE = null;
        
        private EmptyResponse() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lsotra/i/chachingdemo/api/ApiResponse$Loading;", "Lsotra/i/chachingdemo/api/ApiResponse;", "", "()V", "app_debug"})
    public static final class Loading extends sotra.i.chachingdemo.api.ApiResponse {
        public static final sotra.i.chachingdemo.api.ApiResponse.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
}