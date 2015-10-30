package com.ca.wiremock_demo;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.github.tomakehurst.wiremock.junit.WireMockRule;

/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with CloudAxis. This 
 * information shall not be distributed or copied without written 
 * permission from the CloudAxis.
 *
 ***************************************************************************/

/***************************************************************************
 * <PRE>
 * 
 *  Creation Date   : 30 Oct, 2015
 * 
 *  Author          : keson
 * 
 *  Purpose         : TODO
 * 
 * 
 *  History         : TODO
 * 
 * </PRE>
 ***************************************************************************/
public class MockMappingFile {


		@Rule
		public WireMockRule wiremock = new WireMockRule();

		@Before
		public void before() {
		}

		@After
		public void after() {
		}

		@Test
		public void useWireMock() throws IOException {

			URL uri = new URL("http://localhost:8080/test-mapping-plaintext-file");
			InputStream content = uri.openConnection().getInputStream();
			final String retrievedBody = IOUtils.toString(content);
			assertEquals("Some example test from a file", retrievedBody);
		}



}
