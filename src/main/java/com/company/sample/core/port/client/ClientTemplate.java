package com.company.sample.core.port.client;

import org.springframework.http.HttpHeaders;
import reactor.core.publisher.Flux;

import java.util.function.Consumer;

/**
 * POST, GET sang hệ thống khác
 *
 * @param <B> kiểu dữ liệu của request body
 * @param <R> kiểu dữ liệu của response
 */
public interface ClientTemplate<B, R> {

    /**
     * get non-blocking
     *
     * @param uri               uri
     * @param headersConsumer   http header, ví dụ: Consumer<HttpHeaders> headersConsumer = httpHeaders -> {httpHeaders.setBearerAuth(token);};
     * @param responseClass     class của response, ví dụ: TimeOutTransResponse.Class
     * @param consumer          lambda expression để xử lý mỗi khi có response, ví dụ:
     *                          Consumer<TimeOutTransResponse> printConsumer = x -> System.out.println("Response:" + x);
     *                          Nếu null thì không xử lý khi có response
     * @return                  Flux<R> với R là kiểu dữ liệu của response
     */
    Flux<R> get(String uri, Consumer<HttpHeaders> headersConsumer, int timeOutSeconds, Class<R> responseClass, Consumer<? super R> consumer);

    /**
     * post non-blocking http
     *
     * @param uri              uri
     * @param headersConsumer  http header, ví dụ: Consumer<HttpHeaders> headersConsumer = httpHeaders -> {httpHeaders.setBearerAuth(token);};
     * @param body             body request
     * @param bodyClass        class của body request, ví dụ: TopUpDTO.Class
     * @param responseClass    class của response, ví dụ: TopUpResponse.Class
     * @param consumer         lambda expression để xử lý mỗi khi có response, ví dụ:
     *                         Consumer<TopUpResponse> printConsumer = x -> System.out.println("Response:" + x);
     *                         Nếu null thì không xử lý khi có response
     * @return                 Flux<R> với R là kiểu dữ liệu của response
     */
    Flux<R> post(String uri, Consumer<HttpHeaders> headersConsumer, int timeOutSeconds, B body, Class<B> bodyClass, Class<R> responseClass,
                 Consumer<? super R> consumer);

    /**
     * get blocking
     * @param uri             uri
     * @param headers         http headers
     * @param responseClass   class của response, ví dụ: TopUpResponse.Class
     * @return                responseDTO
     */
    R get(String uri, HttpHeaders headers, int timeOutSeconds, Class<R> responseClass);

    /**
     * post blocking
     * @param uri            uri
     * @param headers        http headers
     * @param body           class của body request, ví dụ: TopUpDTO.Class
     * @param responseClass  class của response, ví dụ: TopUpResponse.Class
     * @return               responseDTO
     */
    R post(String uri, HttpHeaders headers, int timeOutSeconds, B body, Class<R> responseClass);
}

