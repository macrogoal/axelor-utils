package com.axelor.utils.utils;

import com.axelor.common.ResourceUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.concurrent.ThreadSafe;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

@ThreadSafe
@Singleton
public class TestHelper {

  protected final ObjectMapper mapper;

  @Inject
  public TestHelper(ObjectMapper mapper) {
    this.mapper = mapper;
  }

  protected InputStream read(String resource) {
    return ResourceUtils.getResourceStream(resource);
  }

  protected ObjectMapper getObjectMapper() {
    return mapper;
  }

  @SuppressWarnings("unchecked")
  public <T> T unmarshal(String resource, Class<T> type) throws JAXBException, IOException {
    JAXBContext context = JAXBContext.newInstance(type);
    Unmarshaller unmarshaller = context.createUnmarshaller();
    return (T) unmarshaller.unmarshal(read(resource));
  }
}
