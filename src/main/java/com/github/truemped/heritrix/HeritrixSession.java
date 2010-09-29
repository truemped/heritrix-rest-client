package com.github.truemped.heritrix;

import org.apache.http.HttpResponse;
import org.w3c.dom.Document;

/**
 * Interface for the Heritrix REST API.
 *
 * @author truemped@googlemail.com
 */
public interface HeritrixSession {

      /**
     * @param jobName
     * @param cXml
     */
    void updateConfig(String jobName, String cXml);

    /**
     * @param jobName
     */
    void checkpointJob(String jobName);

    /**
     * @param jobName
     */
    void tearDownJob(String jobName);

    /**
     * @param jobName
     */
    void terminateJob(String jobName);

    /**
     * @param jobName
     */
    boolean launchJob(String jobName);

    /**
     * @param jobName
     */
    boolean buildJob(String jobName);

    /**
     * @param jobName
     */
    void unpauseJob(String jobName);

    /**
     * @param jobName
     */
    void pauseJob(String jobName);

    /**
     * @return TODO
     *
     */
    Document rescanJobDirectory();

    /**
     * @param jobName
     */
    void createJob(String jobName);

    /**
     * @param jobName
     * @return <b>true</b> if the job is running.
     */
    boolean isJobRunning(String jobName);

    /**
     * @param jobName
     * @return
     */
    Document getJobStatus(String jobName);

    /**
     * @param jobName
     * @return the crawlLog.
     */
    HttpResponse getCrawlLog(String jobName);

    /**
     * @param jobName
     * @return
     */
    boolean jobExists(String jobName);

    /**
     * Produces a job with the jobName which is a copy of the original.
     * @param original
     * @param jobName
     * @param asProfile true if there is no sample and the job hast to be constructed based on a profile.
     */
    void copyJob(String original, String jobName, boolean asProfile);

    /**
     * @param jobName
     * @return
     */
    boolean isPaused(String jobName);

}
