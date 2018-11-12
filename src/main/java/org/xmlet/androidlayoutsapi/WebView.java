package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class WebView<Z extends Element> implements CustomAttributeGroup<WebView<Z>, Z>, TextGroup<WebView<Z>, Z>, AbsoluteLayoutHierarchyInterface<WebView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public WebView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementWebView(this);
   }

   public WebView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementWebView(this);
   }

   protected WebView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementWebView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentWebView(this);
      return this.parent;
   }

   public final WebView<Z> dynamic(Consumer<WebView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final WebView<Z> of(Consumer<WebView<Z>> consumer) {
      consumer.accept(this);
      return this;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "webView";
   }

   public final WebView<Z> self() {
      return this;
   }
}
