package com.rivera.oss.embedded.rabbitmq;

public class DownloadException extends RuntimeException {

  public DownloadException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
