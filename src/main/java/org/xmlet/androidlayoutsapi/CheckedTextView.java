package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class CheckedTextView<Z extends Element> implements CustomAttributeGroup<CheckedTextView<Z>, Z>, TextGroup<CheckedTextView<Z>, Z>, TextViewHierarchyInterface<CheckedTextView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public CheckedTextView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementCheckedTextView(this);
   }

   public CheckedTextView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementCheckedTextView(this);
   }

   protected CheckedTextView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementCheckedTextView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentCheckedTextView(this);
      return this.parent;
   }

   public final CheckedTextView<Z> dynamic(Consumer<CheckedTextView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final CheckedTextView<Z> of(Consumer<CheckedTextView<Z>> consumer) {
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
      return "checkedTextView";
   }

   public final CheckedTextView<Z> self() {
      return this;
   }

   public final CheckedTextView<Z> attrCheckMark(String attrCheckMark) {
      this.visitor.visitAttributeCheckMark(attrCheckMark);
      return this;
   }

   public final CheckedTextView<Z> attrChecked(String attrChecked) {
      this.visitor.visitAttributeChecked(attrChecked);
      return this;
   }
}
