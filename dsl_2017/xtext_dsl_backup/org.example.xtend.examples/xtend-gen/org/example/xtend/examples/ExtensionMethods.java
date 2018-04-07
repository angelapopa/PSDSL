package org.example.xtend.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("all")
public class ExtensionMethods {
  public void myListMethod(final List<?> list) {
    List<Object> someThing = Collections.<Object>emptyList();
  }
  
  public void m() {
    final ArrayList<String> list = new ArrayList<String>();
    this.myListMethod(list);
  }
}
