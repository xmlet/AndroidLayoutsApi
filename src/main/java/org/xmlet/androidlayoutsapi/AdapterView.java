package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class AdapterView<Z extends Element> implements CustomAttributeGroup<AdapterView<Z>, Z>, TextGroup<AdapterView<Z>, Z>, ViewGroupHierarchyInterface<AdapterView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public AdapterView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAdapterView(this);
   }

   public AdapterView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAdapterView(this);
   }

   protected AdapterView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAdapterView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAdapterView(this);
      return this.parent;
   }

   public final AdapterView<Z> dynamic(Consumer<AdapterView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final AdapterView<Z> of(Consumer<AdapterView<Z>> consumer) {
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
      return "adapterView";
   }

   public final AdapterView<Z> self() {
      return this;
   }
}
