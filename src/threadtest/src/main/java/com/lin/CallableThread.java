package com.lin;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

public class CallableThread implements Callable<Boolean> {
    private String url;
    private String name;

    public CallableThread(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public Boolean call() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url, name);
        System.out.println("Download file name: " + name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableThread c1 = new CallableThread("https://memeprod.ap-south-1.linodeobjects.com/user-template/91f304f422e7886a9545402aee24292d.png", "c1");
        CallableThread c2 = new CallableThread("https://memeprod.ap-south-1.linodeobjects.com/user-template/91f304f422e7886a9545402aee24292d.png", "c2");
        CallableThread c3 = new CallableThread("https://memeprod.ap-south-1.linodeobjects.com/user-template/91f304f422e7886a9545402aee24292d.png", "c3");

        // create thread pool
        ExecutorService es = Executors.newFixedThreadPool(3);

        // start
        Future<Boolean> r1 = es.submit(c1);
        Future<Boolean> r2 = es.submit(c2);
        Future<Boolean> r3 = es.submit(c3);

        // get result
        boolean result1 = r1.get();
        boolean result2 = r1.get();
        boolean result3 = r1.get();

        // close service
        es.shutdownNow();

    }

    class WebDownloader {
        public void downloader(String url, String name) {

            try {
                FileUtils.copyURLToFile(new URL(url), new File(name));
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("IO exception, downloader problem");
            }
        }
    }
}
