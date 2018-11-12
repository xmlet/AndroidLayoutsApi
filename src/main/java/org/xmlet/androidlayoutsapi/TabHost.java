package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class TabHost<Z extends Element> implements CustomAttributeGroup<TabHost<Z>, Z>, TextGroup<TabHost<Z>, Z>, FrameLayoutHierarchyInterface<TabHost<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public TabHost(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementTabHost(this);
   }

   public TabHost(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementTabHost(this);
   }

   protected TabHost(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementTabHost(this);
      }

   }

   public Z __() {
      this.visitor.visitParentTabHost(this);
      return this.parent;
   }

   public final TabHost<Z> dynamic(Consumer<TabHost<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final TabHost<Z> of(Consumer<TabHost<Z>> consumer) {
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
      return "tabHost";
   }

   public final TabHost<Z> self() {
      return this;
   }
}
