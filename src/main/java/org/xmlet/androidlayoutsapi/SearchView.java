package org.xmlet.androidlayoutsapi;

import java.util.function.Consumer;

public final class SearchView<Z extends Element> implements CustomAttributeGroup<SearchView<Z>, Z>, TextGroup<SearchView<Z>, Z>, LinearLayoutHierarchyInterface<SearchView<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public SearchView(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementSearchView(this);
   }

   public SearchView(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementSearchView(this);
   }

   protected SearchView(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementSearchView(this);
      }

   }

   public Z __() {
      this.visitor.visitParentSearchView(this);
      return this.parent;
   }

   public final SearchView<Z> dynamic(Consumer<SearchView<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final SearchView<Z> of(Consumer<SearchView<Z>> consumer) {
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
      return "searchView";
   }

   public final SearchView<Z> self() {
      return this;
   }

   public final SearchView<Z> attrIconifiedByDefault(String attrIconifiedByDefault) {
      this.visitor.visitAttributeIconifiedByDefault(attrIconifiedByDefault);
      return this;
   }

   public final SearchView<Z> attrImeOptions(String attrImeOptions) {
      this.visitor.visitAttributeImeOptions(attrImeOptions);
      return this;
   }

   public final SearchView<Z> attrInputType(String attrInputType) {
      this.visitor.visitAttributeInputType(attrInputType);
      return this;
   }

   public final SearchView<Z> attrMaxWidth(String attrMaxWidth) {
      this.visitor.visitAttributeMaxWidth(attrMaxWidth);
      return this;
   }

   public final SearchView<Z> attrQueryHint(String attrQueryHint) {
      this.visitor.visitAttributeQueryHint(attrQueryHint);
      return this;
   }
}
