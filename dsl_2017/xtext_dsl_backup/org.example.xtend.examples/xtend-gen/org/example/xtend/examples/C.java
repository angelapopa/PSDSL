package org.example.xtend.examples;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.example.xtend.examples.MyListExtensions;

@SuppressWarnings("all")
public class C {
  @Extension
  private MyListExtensions e = new MyListExtensions();
  
  public Object m() {
    Object _xblockexpression = null;
    {
      final ArrayList<String> list = new ArrayList<String>();
      this.e.aListMethod(list);
      _xblockexpression = this.e.anotherListMethod(list);
    }
    return _xblockexpression;
  }
  
  public Object orLikeThis() {
    Object _xblockexpression = null;
    {
      @Extension
      final MyListExtensions e = new MyListExtensions();
      final ArrayList<String> list = new ArrayList<String>();
      e.aListMethod(list);
      _xblockexpression = e.anotherListMethod(list);
    }
    return _xblockexpression;
  }
  
  public Object orEvenLikeThis(@Extension final MyListExtensions e) {
    Object _xblockexpression = null;
    {
      ArrayList<String> list = new ArrayList<String>();
      e.aListMethod(list);
      _xblockexpression = e.anotherListMethod(list);
    }
    return _xblockexpression;
  }
}
