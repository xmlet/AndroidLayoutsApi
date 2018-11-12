package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class MultiAutoCompleteTextView<Z extends Element> implements CustomAttributeGroup<MultiAutoCompleteTextView<Z>, Z>, TextGroup<MultiAutoCompleteTextView<Z>, Z>, AutoCompleteTextViewHierarchyInterface<MultiAutoCompleteTextView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public MultiAutoCompleteTextView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementMultiAutoCompleteTextView(this);
   }

   public MultiAutoCompleteTextView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementMultiAutoCompleteTextView(this);
   }

   protected MultiAutoCompleteTextView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementMultiAutoCompleteTextView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentMultiAutoCompleteTextView(this);
      return this.parent;
   }

   public final MultiAutoCompleteTextView<Z> dynamic(Consumer<MultiAutoCompleteTextView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final MultiAutoCompleteTextView<Z> of(Consumer<MultiAutoCompleteTextView<Z>> consumer) {
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
      return "multiAutoCompleteTextView";
   }

   public final MultiAutoCompleteTextView<Z> self() {
      return this;
   }
}
