package org.xmlet.androidlayoutsapi;

public abstract class ElementVisitor {
   public abstract void visitElement(Element var1);

   public abstract void visitAttribute(String var1, String var2);

   public abstract void visitParent(Element var1);

   public abstract <R> void visitText(Text<? extends Element, R> var1);

   public abstract <R> void visitComment(Text<? extends Element, R> var1);

   public void visitOpenDynamic() {
   }

   public void visitCloseDynamic() {
   }

   public <Z extends Element> void visitParentTimePicker(TimePicker<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentMediaController(MediaController<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentRadioGroup(RadioGroup<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentKeyboardView(KeyboardView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAdapterViewAnimator(AdapterViewAnimator<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentListView(ListView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentButton(Button<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentMultiAutoCompleteTextView(MultiAutoCompleteTextView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentQuickContactBadge(QuickContactBadge<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentTextView(TextView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentImageView(ImageView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentHorizontalScrollView(HorizontalScrollView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentSurfaceView(SurfaceView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentEditText(EditText<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentSpace(Space<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentNumberPicker(NumberPicker<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentExtractEditText(ExtractEditText<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentTabHost(TabHost<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentCheckedTextView(CheckedTextView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentSwitchh(Switchh<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAbsListView(AbsListView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentRadioButton(RadioButton<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAdapterViewFlipper(AdapterViewFlipper<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentGLSurfaceView(GLSurfaceView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentRSSurfaceView(RSSurfaceView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentViewStub(ViewStub<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentCheckBox(CheckBox<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentGallery(Gallery<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentTableRow(TableRow<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentRelativeLayout(RelativeLayout<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAdapterView(AdapterView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentDatePicker(DatePicker<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentTwoLineListItem(TwoLineListItem<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentSlidingDrawer(SlidingDrawer<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentImageSwitcher(ImageSwitcher<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentSpinner(Spinner<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentVideoView(VideoView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentGestureOverlayView(GestureOverlayView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentTabWidget(TabWidget<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentViewSwitcher(ViewSwitcher<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAppWidgetHostView(AppWidgetHostView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentViewFlipper(ViewFlipper<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentGridLayout(GridLayout<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentImageButton(ImageButton<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAnalogClock(AnalogClock<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAbsSpinner(AbsSpinner<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentTextureView(TextureView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentWebView(WebView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentStackView(StackView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentProgressBar(ProgressBar<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentTableLayout(TableLayout<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentExpandableListView(ExpandableListView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAndroidView(AndroidView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentZoomControls(ZoomControls<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentToggleButton(ToggleButton<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentCalendarView(CalendarView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentSeekBar(SeekBar<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentViewGroup(ViewGroup<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentZoomButton(ZoomButton<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentView(View<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentRatingBar(RatingBar<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAbsoluteLayout(AbsoluteLayout<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentDialerFilter(DialerFilter<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentFragmentBreadCrumbs(FragmentBreadCrumbs<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentScrollView(ScrollView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentSearchView(SearchView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentViewAnimator(ViewAnimator<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentRSTextureView(RSTextureView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentChronometer(Chronometer<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAbsSeekBar(AbsSeekBar<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentFrameLayout(FrameLayout<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentTextSwitcher(TextSwitcher<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentDigitalClock(DigitalClock<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentGridView(GridView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentCompoundButton(CompoundButton<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentLinearLayout(LinearLayout<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAutoCompleteTextView(AutoCompleteTextView<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitElementTimePicker(TimePicker<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementMediaController(MediaController<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementRadioGroup(RadioGroup<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementKeyboardView(KeyboardView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAdapterViewAnimator(AdapterViewAnimator<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementListView(ListView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementButton(Button<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementMultiAutoCompleteTextView(MultiAutoCompleteTextView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementQuickContactBadge(QuickContactBadge<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementTextView(TextView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementImageView(ImageView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementHorizontalScrollView(HorizontalScrollView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementSurfaceView(SurfaceView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementEditText(EditText<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementSpace(Space<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementNumberPicker(NumberPicker<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementExtractEditText(ExtractEditText<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementTabHost(TabHost<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementCheckedTextView(CheckedTextView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementSwitchh(Switchh<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAbsListView(AbsListView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementRadioButton(RadioButton<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAdapterViewFlipper(AdapterViewFlipper<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementGLSurfaceView(GLSurfaceView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementRSSurfaceView(RSSurfaceView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementViewStub(ViewStub<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementCheckBox(CheckBox<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementGallery(Gallery<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementTableRow(TableRow<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementRelativeLayout(RelativeLayout<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAdapterView(AdapterView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementDatePicker(DatePicker<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementTwoLineListItem(TwoLineListItem<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementSlidingDrawer(SlidingDrawer<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementImageSwitcher(ImageSwitcher<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementSpinner(Spinner<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementVideoView(VideoView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementGestureOverlayView(GestureOverlayView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementTabWidget(TabWidget<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementViewSwitcher(ViewSwitcher<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAppWidgetHostView(AppWidgetHostView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementViewFlipper(ViewFlipper<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementGridLayout(GridLayout<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementImageButton(ImageButton<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAnalogClock(AnalogClock<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAbsSpinner(AbsSpinner<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementTextureView(TextureView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementWebView(WebView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementStackView(StackView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementProgressBar(ProgressBar<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementTableLayout(TableLayout<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementExpandableListView(ExpandableListView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAndroidView(AndroidView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementZoomControls(ZoomControls<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementToggleButton(ToggleButton<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementCalendarView(CalendarView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementSeekBar(SeekBar<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementViewGroup(ViewGroup<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementZoomButton(ZoomButton<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementView(View<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementRatingBar(RatingBar<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAbsoluteLayout(AbsoluteLayout<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementDialerFilter(DialerFilter<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementFragmentBreadCrumbs(FragmentBreadCrumbs<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementScrollView(ScrollView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementSearchView(SearchView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementViewAnimator(ViewAnimator<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementRSTextureView(RSTextureView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementChronometer(Chronometer<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAbsSeekBar(AbsSeekBar<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementFrameLayout(FrameLayout<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementTextSwitcher(TextSwitcher<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementDigitalClock(DigitalClock<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementGridView(GridView<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementCompoundButton(CompoundButton<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementLinearLayout(LinearLayout<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAutoCompleteTextView(AutoCompleteTextView<Z> var1) {
      this.visitElement(var1);
   }

   public void visitAttributeLayoutToLeftOf(String layoutToLeftOf) {
      this.visitAttribute("layout_toLeftOf", layoutToLeftOf);
   }

   public void visitAttributeLayoutAnimation(String layoutAnimation) {
      this.visitAttribute("layoutAnimation", layoutAnimation);
   }

   public void visitAttributeBufferType(String bufferType) {
      this.visitAttribute("bufferType", bufferType);
   }

   public void visitAttributeAdjustViewBounds(String adjustViewBounds) {
      this.visitAttribute("adjustViewBounds", adjustViewBounds);
   }

   public void visitAttributeClickable(String clickable) {
      this.visitAttribute("clickable", clickable);
   }

   public void visitAttributePaddingRight(String paddingRight) {
      this.visitAttribute("paddingRight", paddingRight);
   }

   public void visitAttributePrivateImeOptions(String privateImeOptions) {
      this.visitAttribute("privateImeOptions", privateImeOptions);
   }

   public void visitAttributeWeekSeparatorLineColor(String weekSeparatorLineColor) {
      this.visitAttribute("weekSeparatorLineColor", weekSeparatorLineColor);
   }

   public void visitAttributeDrawableBottom(String drawableBottom) {
      this.visitAttribute("drawableBottom", drawableBottom);
   }

   public void visitAttributeFadeDuration(String fadeDuration) {
      this.visitAttribute("fadeDuration", fadeDuration);
   }

   public void visitAttributeDropDownWidth(String dropDownWidth) {
      this.visitAttribute("dropDownWidth", dropDownWidth);
   }

   public void visitAttributeMinHeight(String minHeight) {
      this.visitAttribute("minHeight", minHeight);
   }

   public void visitAttributePassword(String password) {
      this.visitAttribute("password", password);
   }

   public void visitAttributeGroupIndicator(String groupIndicator) {
      this.visitAttribute("groupIndicator", groupIndicator);
   }

   public void visitAttributeTextEditPasteWindowLayout(String textEditPasteWindowLayout) {
      this.visitAttribute("textEditPasteWindowLayout", textEditPasteWindowLayout);
   }

   public void visitAttributeKeyIcon(String keyIcon) {
      this.visitAttribute("keyIcon", keyIcon);
   }

   public void visitAttributeLineSpacingMultiplier(String lineSpacingMultiplier) {
      this.visitAttribute("lineSpacingMultiplier", lineSpacingMultiplier);
   }

   public void visitAttributeLayoutAlignParentTop(String layoutAlignParentTop) {
      this.visitAttribute("layout_alignParentTop", layoutAlignParentTop);
   }

   public void visitAttributeAllowSingleTap(String allowSingleTap) {
      this.visitAttribute("allowSingleTap", allowSingleTap);
   }

   public void visitAttributeHeight(String height) {
      this.visitAttribute("height", height);
   }

   public void visitAttributeWeekDayTextAppearance(String weekDayTextAppearance) {
      this.visitAttribute("weekDayTextAppearance", weekDayTextAppearance);
   }

   public void visitAttributeEllipsize(String ellipsize) {
      this.visitAttribute("ellipsize", ellipsize);
   }

   public void visitAttributeLayoutAlignWithParentIfMissing(String layoutAlignWithParentIfMissing) {
      this.visitAttribute("layout_alignWithParentIfMissing", layoutAlignWithParentIfMissing);
   }

   public void visitAttributeScrollbarTrackVertical(String scrollbarTrackVertical) {
      this.visitAttribute("scrollbarTrackVertical", scrollbarTrackVertical);
   }

   public void visitAttributeBottomOffset(String bottomOffset) {
      this.visitAttribute("bottomOffset", bottomOffset);
   }

   public void visitAttributeIsModifier(String isModifier) {
      this.visitAttribute("isModifier", isModifier);
   }

   public void visitAttributeOutAnimation(String outAnimation) {
      this.visitAttribute("outAnimation", outAnimation);
   }

   public void visitAttributeLayoutAlignBottom(String layoutAlignBottom) {
      this.visitAttribute("layout_alignBottom", layoutAlignBottom);
   }

   public void visitAttributeSingleLine(String singleLine) {
      this.visitAttribute("singleLine", singleLine);
   }

   public void visitAttributeCapitalize(String capitalize) {
      this.visitAttribute("capitalize", capitalize);
   }

   public void visitAttributeUnselectedAlpha(String unselectedAlpha) {
      this.visitAttribute("unselectedAlpha", unselectedAlpha);
   }

   public void visitAttributeStackFromBottom(String stackFromBottom) {
      this.visitAttribute("stackFromBottom", stackFromBottom);
   }

   public void visitAttributeCompletionHintView(String completionHintView) {
      this.visitAttribute("completionHintView", completionHintView);
   }

   public void visitAttributeOverScrollFooter(String overScrollFooter) {
      this.visitAttribute("overScrollFooter", overScrollFooter);
   }

   public void visitAttributeInterpolator(String interpolator) {
      this.visitAttribute("interpolator", interpolator);
   }

   public void visitAttributeTextCursorDrawable(String textCursorDrawable) {
      this.visitAttribute("textCursorDrawable", textCursorDrawable);
   }

   public void visitAttributeTextEditSuggestionItemLayout(String textEditSuggestionItemLayout) {
      this.visitAttribute("textEditSuggestionItemLayout", textEditSuggestionItemLayout);
   }

   public void visitAttributeLayoutWeight(String layoutWeight) {
      this.visitAttribute("layout_weight", layoutWeight);
   }

   public void visitAttributeScrollbarThumbVertical(String scrollbarThumbVertical) {
      this.visitAttribute("scrollbarThumbVertical", scrollbarThumbVertical);
   }

   public void visitAttributeSaveEnabled(String saveEnabled) {
      this.visitAttribute("saveEnabled", saveEnabled);
   }

   public void visitAttributeSpinnerMode(String spinnerMode) {
      this.visitAttribute("spinnerMode", spinnerMode);
   }

   public void visitAttributeNextFocusUp(String nextFocusUp) {
      this.visitAttribute("nextFocusUp", nextFocusUp);
   }

   public void visitAttributeMinDate(String minDate) {
      this.visitAttribute("minDate", minDate);
   }

   public void visitAttributeIndeterminateDuration(String indeterminateDuration) {
      this.visitAttribute("indeterminateDuration", indeterminateDuration);
   }

   public void visitAttributeImeOptions(String imeOptions) {
      this.visitAttribute("imeOptions", imeOptions);
   }

   public void visitAttributeTransformPivotY(String transformPivotY) {
      this.visitAttribute("transformPivotY", transformPivotY);
   }

   public void visitAttributeTransformPivotX(String transformPivotX) {
      this.visitAttribute("transformPivotX", transformPivotX);
   }

   public void visitAttributeIcon(String icon) {
      this.visitAttribute("icon", icon);
   }

   public void visitAttributeDropDownHorizontalOffset(String dropDownHorizontalOffset) {
      this.visitAttribute("dropDownHorizontalOffset", dropDownHorizontalOffset);
   }

   public void visitAttributeCheckMark(String checkMark) {
      this.visitAttribute("checkMark", checkMark);
   }

   public void visitAttributeLayoutAlignParentLeft(String layoutAlignParentLeft) {
      this.visitAttribute("layout_alignParentLeft", layoutAlignParentLeft);
   }

   public void visitAttributeVerticalScrollbarPosition(String verticalScrollbarPosition) {
      this.visitAttribute("verticalScrollbarPosition", verticalScrollbarPosition);
   }

   public void visitAttributeIsScrollContainer(String isScrollContainer) {
      this.visitAttribute("isScrollContainer", isScrollContainer);
   }

   public void visitAttributeImeActionLabel(String imeActionLabel) {
      this.visitAttribute("imeActionLabel", imeActionLabel);
   }

   public void visitAttributeDisabledAlpha(String disabledAlpha) {
      this.visitAttribute("disabledAlpha", disabledAlpha);
   }

   public void visitAttributeSpacing(String spacing) {
      this.visitAttribute("spacing", spacing);
   }

   public void visitAttributeAddStatesFromChildren(String addStatesFromChildren) {
      this.visitAttribute("addStatesFromChildren", addStatesFromChildren);
   }

   public void visitAttributeMaxHeight(String maxHeight) {
      this.visitAttribute("maxHeight", maxHeight);
   }

   public void visitAttributeThumbOffset(String thumbOffset) {
      this.visitAttribute("thumbOffset", thumbOffset);
   }

   public void visitAttributeTextOn(String textOn) {
      this.visitAttribute("textOn", textOn);
   }

   public void visitAttributeCacheColorHint(String cacheColorHint) {
      this.visitAttribute("cacheColorHint", cacheColorHint);
   }

   public void visitAttributeHorizontalSpacing(String horizontalSpacing) {
      this.visitAttribute("horizontalSpacing", horizontalSpacing);
   }

   public void visitAttributeTabStripEnabled(String tabStripEnabled) {
      this.visitAttribute("tabStripEnabled", tabStripEnabled);
   }

   public void visitAttributeTabStripLeft(String tabStripLeft) {
      this.visitAttribute("tabStripLeft", tabStripLeft);
   }

   public void visitAttributeAlwaysDrawnWithCache(String alwaysDrawnWithCache) {
      this.visitAttribute("alwaysDrawnWithCache", alwaysDrawnWithCache);
   }

   public void visitAttributeKeyboardMode(String keyboardMode) {
      this.visitAttribute("keyboardMode", keyboardMode);
   }

   public void visitAttributeChildIndicator(String childIndicator) {
      this.visitAttribute("childIndicator", childIndicator);
   }

   public void visitAttributeRowCount(String rowCount) {
      this.visitAttribute("rowCount", rowCount);
   }

   public void visitAttributeSplitMotionEvents(String splitMotionEvents) {
      this.visitAttribute("splitMotionEvents", splitMotionEvents);
   }

   public void visitAttributeHandMinute(String handMinute) {
      this.visitAttribute("hand_minute", handMinute);
   }

   public void visitAttributeScrollbarAlwaysDrawVerticalTrack(String scrollbarAlwaysDrawVerticalTrack) {
      this.visitAttribute("scrollbarAlwaysDrawVerticalTrack", scrollbarAlwaysDrawVerticalTrack);
   }

   public void visitAttributeHapticFeedbackEnabled(String hapticFeedbackEnabled) {
      this.visitAttribute("hapticFeedbackEnabled", hapticFeedbackEnabled);
   }

   public void visitAttributeScrollHorizontally(String scrollHorizontally) {
      this.visitAttribute("scrollHorizontally", scrollHorizontally);
   }

   public void visitAttributeLayoutAlignRight(String layoutAlignRight) {
      this.visitAttribute("layout_alignRight", layoutAlignRight);
   }

   public void visitAttributeClipChildren(String clipChildren) {
      this.visitAttribute("clipChildren", clipChildren);
   }

   public void visitAttributeClipToPadding(String clipToPadding) {
      this.visitAttribute("clipToPadding", clipToPadding);
   }

   public void visitAttributeTextAppearance(String textAppearance) {
      this.visitAttribute("textAppearance", textAppearance);
   }

   public void visitAttributeTextEditNoPasteWindowLayout(String textEditNoPasteWindowLayout) {
      this.visitAttribute("textEditNoPasteWindowLayout", textEditNoPasteWindowLayout);
   }

   public void visitAttributeSelectedDateVerticalBar(String selectedDateVerticalBar) {
      this.visitAttribute("selectedDateVerticalBar", selectedDateVerticalBar);
   }

   public void visitAttributeForegroundGravity(String foregroundGravity) {
      this.visitAttribute("foregroundGravity", foregroundGravity);
   }

   public void visitAttributeAnimationResolution(String animationResolution) {
      this.visitAttribute("animationResolution", animationResolution);
   }

   public void visitAttributeAnimationCache(String animationCache) {
      this.visitAttribute("animationCache", animationCache);
   }

   public void visitAttributeEventsInterceptionEnabled(String eventsInterceptionEnabled) {
      this.visitAttribute("eventsInterceptionEnabled", eventsInterceptionEnabled);
   }

   public void visitAttributeShowDividers(String showDividers) {
      this.visitAttribute("showDividers", showDividers);
   }

   public void visitAttributeProgress(String progress) {
      this.visitAttribute("progress", progress);
   }

   public void visitAttributePopupKeyboard(String popupKeyboard) {
      this.visitAttribute("popupKeyboard", popupKeyboard);
   }

   public void visitAttributeDigits(String digits) {
      this.visitAttribute("digits", digits);
   }

   public void visitAttributeTextEditSidePasteWindowLayout(String textEditSidePasteWindowLayout) {
      this.visitAttribute("textEditSidePasteWindowLayout", textEditSidePasteWindowLayout);
   }

   public void visitAttributeLayoutColumnSpan(String layoutColumnSpan) {
      this.visitAttribute("layout_columnSpan", layoutColumnSpan);
   }

   public void visitAttributeFitsSystemWindows(String fitsSystemWindows) {
      this.visitAttribute("fitsSystemWindows", fitsSystemWindows);
   }

   public void visitAttributeTextOff(String textOff) {
      this.visitAttribute("textOff", textOff);
   }

   public void visitAttributeFadingEdge(String fadingEdge) {
      this.visitAttribute("fadingEdge", fadingEdge);
   }

   public void visitAttributeLayoutCenterInParent(String layoutCenterInParent) {
      this.visitAttribute("layout_centerInParent", layoutCenterInParent);
   }

   public void visitAttributeScrollbarTrackHorizontal(String scrollbarTrackHorizontal) {
      this.visitAttribute("scrollbarTrackHorizontal", scrollbarTrackHorizontal);
   }

   public void visitAttributeIgnoreGravity(String ignoreGravity) {
      this.visitAttribute("ignoreGravity", ignoreGravity);
   }

   public void visitAttributeDrawSelectorOnTop(String drawSelectorOnTop) {
      this.visitAttribute("drawSelectorOnTop", drawSelectorOnTop);
   }

   public void visitAttributeKeyEdgeFlags(String keyEdgeFlags) {
      this.visitAttribute("keyEdgeFlags", keyEdgeFlags);
   }

   public void visitAttributeTextSelectHandle(String textSelectHandle) {
      this.visitAttribute("textSelectHandle", textSelectHandle);
   }

   public void visitAttributeFastScrollAlwaysVisible(String fastScrollAlwaysVisible) {
      this.visitAttribute("fastScrollAlwaysVisible", fastScrollAlwaysVisible);
   }

   public void visitAttributeNextFocusRight(String nextFocusRight) {
      this.visitAttribute("nextFocusRight", nextFocusRight);
   }

   public void visitAttributeCursorVisible(String cursorVisible) {
      this.visitAttribute("cursorVisible", cursorVisible);
   }

   public void visitAttributeIncludeFontPadding(String includeFontPadding) {
      this.visitAttribute("includeFontPadding", includeFontPadding);
   }

   public void visitAttributeLayoutToRightOf(String layoutToRightOf) {
      this.visitAttribute("layout_toRightOf", layoutToRightOf);
   }

   public void visitAttributeDrawableLeft(String drawableLeft) {
      this.visitAttribute("drawableLeft", drawableLeft);
   }

   public void visitAttributeSelectedWeekBackgroundColor(String selectedWeekBackgroundColor) {
      this.visitAttribute("selectedWeekBackgroundColor", selectedWeekBackgroundColor);
   }

   public void visitAttributeMarqueeRepeatLimit(String marqueeRepeatLimit) {
      this.visitAttribute("marqueeRepeatLimit", marqueeRepeatLimit);
   }

   public void visitAttributeLayoutHeight(String layoutHeight) {
      this.visitAttribute("layout_height", layoutHeight);
   }

   public void visitAttributeTextFilterEnabled(String textFilterEnabled) {
      this.visitAttribute("textFilterEnabled", textFilterEnabled);
   }

   public void visitAttributeSwitchPadding(String switchPadding) {
      this.visitAttribute("switchPadding", switchPadding);
   }

   public void visitAttributeVisibility(String visibility) {
      this.visitAttribute("visibility", visibility);
   }

   public void visitAttributeInAnimation(String inAnimation) {
      this.visitAttribute("inAnimation", inAnimation);
   }

   public void visitAttributeCheckedButton(String checkedButton) {
      this.visitAttribute("checkedButton", checkedButton);
   }

   public void visitAttributeHandHour(String handHour) {
      this.visitAttribute("hand_hour", handHour);
   }

   public void visitAttributeKeyTextColor(String keyTextColor) {
      this.visitAttribute("keyTextColor", keyTextColor);
   }

   public void visitAttributeFocusedMonthDateColor(String focusedMonthDateColor) {
      this.visitAttribute("focusedMonthDateColor", focusedMonthDateColor);
   }

   public void visitAttributeTextColor(String textColor) {
      this.visitAttribute("textColor", textColor);
   }

   public void visitAttributeMinLines(String minLines) {
      this.visitAttribute("minLines", minLines);
   }

   public void visitAttributeOverridesImplicitlyEnabledSubtype(String overridesImplicitlyEnabledSubtype) {
      this.visitAttribute("overridesImplicitlyEnabledSubtype", overridesImplicitlyEnabledSubtype);
   }

   public void visitAttributeLongClickable(String longClickable) {
      this.visitAttribute("longClickable", longClickable);
   }

   public void visitAttributeIsRepeatable(String isRepeatable) {
      this.visitAttribute("isRepeatable", isRepeatable);
   }

   public void visitAttributeShadowRadius(String shadowRadius) {
      this.visitAttribute("shadowRadius", shadowRadius);
   }

   public void visitAttributeTextScaleX(String textScaleX) {
      this.visitAttribute("textScaleX", textScaleX);
   }

   public void visitAttributeVerticalCorrection(String verticalCorrection) {
      this.visitAttribute("verticalCorrection", verticalCorrection);
   }

   public void visitAttributeTopOffset(String topOffset) {
      this.visitAttribute("topOffset", topOffset);
   }

   public void visitAttributePhoneNumber(String phoneNumber) {
      this.visitAttribute("phoneNumber", phoneNumber);
   }

   public void visitAttributeLayoutMarginBottom(String layoutMarginBottom) {
      this.visitAttribute("layout_marginBottom", layoutMarginBottom);
   }

   public void visitAttributeSecondaryProgress(String secondaryProgress) {
      this.visitAttribute("secondaryProgress", secondaryProgress);
   }

   public void visitAttributeHint(String hint) {
      this.visitAttribute("hint", hint);
   }

   public void visitAttributeFadeOffset(String fadeOffset) {
      this.visitAttribute("fadeOffset", fadeOffset);
   }

   public void visitAttributeMaxLines(String maxLines) {
      this.visitAttribute("maxLines", maxLines);
   }

   public void visitAttributeNumStars(String numStars) {
      this.visitAttribute("numStars", numStars);
   }

   public void visitAttributeLayoutAlignTop(String layoutAlignTop) {
      this.visitAttribute("layout_alignTop", layoutAlignTop);
   }

   public void visitAttributeAutoText(String autoText) {
      this.visitAttribute("autoText", autoText);
   }

   public void visitAttributeKeyTextSize(String keyTextSize) {
      this.visitAttribute("keyTextSize", keyTextSize);
   }

   public void visitAttributeDropDownSelector(String dropDownSelector) {
      this.visitAttribute("dropDownSelector", dropDownSelector);
   }

   public void visitAttributeThumbTextPadding(String thumbTextPadding) {
      this.visitAttribute("thumbTextPadding", thumbTextPadding);
   }

   public void visitAttributeShrinkColumns(String shrinkColumns) {
      this.visitAttribute("shrinkColumns", shrinkColumns);
   }

   public void visitAttributeFadeScrollbars(String fadeScrollbars) {
      this.visitAttribute("fadeScrollbars", fadeScrollbars);
   }

   public void visitAttributeEms(String ems) {
      this.visitAttribute("ems", ems);
   }

   public void visitAttributeShowWeekNumber(String showWeekNumber) {
      this.visitAttribute("showWeekNumber", showWeekNumber);
   }

   public void visitAttributeTint(String tint) {
      this.visitAttribute("tint", tint);
   }

   public void visitAttributeChildDivider(String childDivider) {
      this.visitAttribute("childDivider", childDivider);
   }

   public void visitAttributeIndicatorLeft(String indicatorLeft) {
      this.visitAttribute("indicatorLeft", indicatorLeft);
   }

   public void visitAttributeContent(String content) {
      this.visitAttribute("content", content);
   }

   public void visitAttributeButton(String button) {
      this.visitAttribute("button", button);
   }

   public void visitAttributeIndeterminateOnly(String indeterminateOnly) {
      this.visitAttribute("indeterminateOnly", indeterminateOnly);
   }

   public void visitAttributeCompletionHint(String completionHint) {
      this.visitAttribute("completionHint", completionHint);
   }

   public void visitAttributeDivider(String divider) {
      this.visitAttribute("divider", divider);
   }

   public void visitAttributeAlpha(String alpha) {
      this.visitAttribute("alpha", alpha);
   }

   public void visitAttributeFillViewport(String fillViewport) {
      this.visitAttribute("fillViewport", fillViewport);
   }

   public void visitAttributeLayoutSpan(String layoutSpan) {
      this.visitAttribute("layout_span", layoutSpan);
   }

   public void visitAttributeFilterTouchesWhenObscured(String filterTouchesWhenObscured) {
      this.visitAttribute("filterTouchesWhenObscured", filterTouchesWhenObscured);
   }

   public void visitAttributePaddingTop(String paddingTop) {
      this.visitAttribute("paddingTop", paddingTop);
   }

   public void visitAttributeLines(String lines) {
      this.visitAttribute("lines", lines);
   }

   public void visitAttributeGestureStrokeType(String gestureStrokeType) {
      this.visitAttribute("gestureStrokeType", gestureStrokeType);
   }

   public void visitAttributeIndeterminateDrawable(String indeterminateDrawable) {
      this.visitAttribute("indeterminateDrawable", indeterminateDrawable);
   }

   public void visitAttributeScrollbarDefaultDelayBeforeFade(String scrollbarDefaultDelayBeforeFade) {
      this.visitAttribute("scrollbarDefaultDelayBeforeFade", scrollbarDefaultDelayBeforeFade);
   }

   public void visitAttributePopupBackground(String popupBackground) {
      this.visitAttribute("popupBackground", popupBackground);
   }

   public void visitAttributeImeSubtypeLocale(String imeSubtypeLocale) {
      this.visitAttribute("imeSubtypeLocale", imeSubtypeLocale);
   }

   public void visitAttributeLabelTextSize(String labelTextSize) {
      this.visitAttribute("labelTextSize", labelTextSize);
   }

   public void visitAttributeLayerType(String layerType) {
      this.visitAttribute("layerType", layerType);
   }

   public void visitAttributeMinEms(String minEms) {
      this.visitAttribute("minEms", minEms);
   }

   public void visitAttributeTextSize(String textSize) {
      this.visitAttribute("textSize", textSize);
   }

   public void visitAttributeRotation(String rotation) {
      this.visitAttribute("rotation", rotation);
   }

   public void visitAttributeLabel(String label) {
      this.visitAttribute("label", label);
   }

   public void visitAttributeGestureStrokeWidth(String gestureStrokeWidth) {
      this.visitAttribute("gestureStrokeWidth", gestureStrokeWidth);
   }

   public void visitAttributeImeSubtypeExtraValue(String imeSubtypeExtraValue) {
      this.visitAttribute("imeSubtypeExtraValue", imeSubtypeExtraValue);
   }

   public void visitAttributeLayoutMarginTop(String layoutMarginTop) {
      this.visitAttribute("layout_marginTop", layoutMarginTop);
   }

   public void visitAttributeLayout(String layout) {
      this.visitAttribute("layout", layout);
   }

   public void visitAttributeAnimationDuration(String animationDuration) {
      this.visitAttribute("animationDuration", animationDuration);
   }

   public void visitAttributeOverScrollHeader(String overScrollHeader) {
      this.visitAttribute("overScrollHeader", overScrollHeader);
   }

   public void visitAttributeGestureStrokeLengthThreshold(String gestureStrokeLengthThreshold) {
      this.visitAttribute("gestureStrokeLengthThreshold", gestureStrokeLengthThreshold);
   }

   public void visitAttributeScrollbars(String scrollbars) {
      this.visitAttribute("scrollbars", scrollbars);
   }

   public void visitAttributeDateTextAppearance(String dateTextAppearance) {
      this.visitAttribute("dateTextAppearance", dateTextAppearance);
   }

   public void visitAttributeGravity(String gravity) {
      this.visitAttribute("gravity", gravity);
   }

   public void visitAttributeGestureStrokeSquarenessThreshold(String gestureStrokeSquarenessThreshold) {
      this.visitAttribute("gestureStrokeSquarenessThreshold", gestureStrokeSquarenessThreshold);
   }

   public void visitAttributeProgressDrawable(String progressDrawable) {
      this.visitAttribute("progressDrawable", progressDrawable);
   }

   public void visitAttributeGestureColor(String gestureColor) {
      this.visitAttribute("gestureColor", gestureColor);
   }

   public void visitAttributeSwitchMinWidth(String switchMinWidth) {
      this.visitAttribute("switchMinWidth", switchMinWidth);
   }

   public void visitAttributePrompt(String prompt) {
      this.visitAttribute("prompt", prompt);
   }

   public void visitAttributeDuplicateParentState(String duplicateParentState) {
      this.visitAttribute("duplicateParentState", duplicateParentState);
   }

   public void visitAttributeNumColumns(String numColumns) {
      this.visitAttribute("numColumns", numColumns);
   }

   public void visitAttributeListSelector(String listSelector) {
      this.visitAttribute("listSelector", listSelector);
   }

   public void visitAttributeScrollbarStyle(String scrollbarStyle) {
      this.visitAttribute("scrollbarStyle", scrollbarStyle);
   }

   public void visitAttributeIndeterminate(String indeterminate) {
      this.visitAttribute("indeterminate", indeterminate);
   }

   public void visitAttributeVerticalSpacing(String verticalSpacing) {
      this.visitAttribute("verticalSpacing", verticalSpacing);
   }

   public void visitAttributeLayoutGravity(String layoutGravity) {
      this.visitAttribute("layout_gravity", layoutGravity);
   }

   public void visitAttributeForeground(String foreground) {
      this.visitAttribute("foreground", foreground);
   }

   public void visitAttributeChoiceMode(String choiceMode) {
      this.visitAttribute("choiceMode", choiceMode);
   }

   public void visitAttributeAnimateFirstView(String animateFirstView) {
      this.visitAttribute("animateFirstView", animateFirstView);
   }

   public void visitAttributeRotationX(String rotationX) {
      this.visitAttribute("rotationX", rotationX);
   }

   public void visitAttributeUseDefaultMargins(String useDefaultMargins) {
      this.visitAttribute("useDefaultMargins", useDefaultMargins);
   }

   public void visitAttributeNextFocusLeft(String nextFocusLeft) {
      this.visitAttribute("nextFocusLeft", nextFocusLeft);
   }

   public void visitAttributeRotationY(String rotationY) {
      this.visitAttribute("rotationY", rotationY);
   }

   public void visitAttributeUncertainGestureColor(String uncertainGestureColor) {
      this.visitAttribute("uncertainGestureColor", uncertainGestureColor);
   }

   public void visitAttributeDropDownVerticalOffset(String dropDownVerticalOffset) {
      this.visitAttribute("dropDownVerticalOffset", dropDownVerticalOffset);
   }

   public void visitAttributeId(String id) {
      this.visitAttribute("id", id);
   }

   public void visitAttributeText(String text) {
      this.visitAttribute("text", text);
   }

   public void visitAttributeBaselineAlignedChildIndex(String baselineAlignedChildIndex) {
      this.visitAttribute("baselineAlignedChildIndex", baselineAlignedChildIndex);
   }

   public void visitAttributeDrawableStart(String drawableStart) {
      this.visitAttribute("drawableStart", drawableStart);
   }

   public void visitAttributeShadowColor(String shadowColor) {
      this.visitAttribute("shadowColor", shadowColor);
   }

   public void visitAttributeCollapseColumns(String collapseColumns) {
      this.visitAttribute("collapseColumns", collapseColumns);
   }

   public void visitAttributeKeyLabel(String keyLabel) {
      this.visitAttribute("keyLabel", keyLabel);
   }

   public void visitAttributeMaxWidth(String maxWidth) {
      this.visitAttribute("maxWidth", maxWidth);
   }

   public void visitAttributeGestureStrokeAngleThreshold(String gestureStrokeAngleThreshold) {
      this.visitAttribute("gestureStrokeAngleThreshold", gestureStrokeAngleThreshold);
   }

   public void visitAttributeTextColorLink(String textColorLink) {
      this.visitAttribute("textColorLink", textColorLink);
   }

   public void visitAttributeHeaderDividersEnabled(String headerDividersEnabled) {
      this.visitAttribute("headerDividersEnabled", headerDividersEnabled);
   }

   public void visitAttributeLayoutScale(String layoutScale) {
      this.visitAttribute("layout_scale", layoutScale);
   }

   public void visitAttributeTextSelectHandleRight(String textSelectHandleRight) {
      this.visitAttribute("textSelectHandleRight", textSelectHandleRight);
   }

   public void visitAttributeLayoutRow(String layoutRow) {
      this.visitAttribute("layout_row", layoutRow);
   }

   public void visitAttributeTextSelectHandleLeft(String textSelectHandleLeft) {
      this.visitAttribute("textSelectHandleLeft", textSelectHandleLeft);
   }

   public void visitAttributeQueryHint(String queryHint) {
      this.visitAttribute("queryHint", queryHint);
   }

   public void visitAttributeLineSpacingExtra(String lineSpacingExtra) {
      this.visitAttribute("lineSpacingExtra", lineSpacingExtra);
   }

   public void visitAttributeFocusable(String focusable) {
      this.visitAttribute("focusable", focusable);
   }

   public void visitAttributeHandle(String handle) {
      this.visitAttribute("handle", handle);
   }

   public void visitAttributeBaseline(String baseline) {
      this.visitAttribute("baseline", baseline);
   }

   public void visitAttributeAnimateOnClick(String animateOnClick) {
      this.visitAttribute("animateOnClick", animateOnClick);
   }

   public void visitAttributeTypeface(String typeface) {
      this.visitAttribute("typeface", typeface);
   }

   public void visitAttributeLayoutRowSpan(String layoutRowSpan) {
      this.visitAttribute("layout_rowSpan", layoutRowSpan);
   }

   public void visitAttributeFreezesText(String freezesText) {
      this.visitAttribute("freezesText", freezesText);
   }

   public void visitAttributeTranslationX(String translationX) {
      this.visitAttribute("translationX", translationX);
   }

   public void visitAttributeLayoutBelow(String layoutBelow) {
      this.visitAttribute("layout_below", layoutBelow);
   }

   public void visitAttributeCropToPadding(String cropToPadding) {
      this.visitAttribute("cropToPadding", cropToPadding);
   }

   public void visitAttributeIconifiedByDefault(String iconifiedByDefault) {
      this.visitAttribute("iconifiedByDefault", iconifiedByDefault);
   }

   public void visitAttributeOverScrollMode(String overScrollMode) {
      this.visitAttribute("overScrollMode", overScrollMode);
   }

   public void visitAttributeTranslationY(String translationY) {
      this.visitAttribute("translationY", translationY);
   }

   public void visitAttributeStretchMode(String stretchMode) {
      this.visitAttribute("stretchMode", stretchMode);
   }

   public void visitAttributePaddingLeft(String paddingLeft) {
      this.visitAttribute("paddingLeft", paddingLeft);
   }

   public void visitAttributeShadowDx(String shadowDx) {
      this.visitAttribute("shadowDx", shadowDx);
   }

   public void visitAttributeShadowDy(String shadowDy) {
      this.visitAttribute("shadowDy", shadowDy);
   }

   public void visitAttributeInflatedId(String inflatedId) {
      this.visitAttribute("inflatedId", inflatedId);
   }

   public void visitAttributeTranscriptMode(String transcriptMode) {
      this.visitAttribute("transcriptMode", transcriptMode);
   }

   public void visitAttributeShownWeekCount(String shownWeekCount) {
      this.visitAttribute("shownWeekCount", shownWeekCount);
   }

   public void visitAttributeAnimateLayoutChanges(String animateLayoutChanges) {
      this.visitAttribute("animateLayoutChanges", animateLayoutChanges);
   }

   public void visitAttributeColumnOrderPreserved(String columnOrderPreserved) {
      this.visitAttribute("columnOrderPreserved", columnOrderPreserved);
   }

   public void visitAttributeThumb(String thumb) {
      this.visitAttribute("thumb", thumb);
   }

   public void visitAttributeMaxEms(String maxEms) {
      this.visitAttribute("maxEms", maxEms);
   }

   public void visitAttributeLoopViews(String loopViews) {
      this.visitAttribute("loopViews", loopViews);
   }

   public void visitAttributePopupLayout(String popupLayout) {
      this.visitAttribute("popupLayout", popupLayout);
   }

   public void visitAttributeIsSticky(String isSticky) {
      this.visitAttribute("isSticky", isSticky);
   }

   public void visitAttributeCompletionThreshold(String completionThreshold) {
      this.visitAttribute("completionThreshold", completionThreshold);
   }

   public void visitAttributeSwitchTextAppearance(String switchTextAppearance) {
      this.visitAttribute("switchTextAppearance", switchTextAppearance);
   }

   public void visitAttributeEnabled(String enabled) {
      this.visitAttribute("enabled", enabled);
   }

   public void visitAttributeWeekNumberColor(String weekNumberColor) {
      this.visitAttribute("weekNumberColor", weekNumberColor);
   }

   public void visitAttributeScrollbarThumbHorizontal(String scrollbarThumbHorizontal) {
      this.visitAttribute("scrollbarThumbHorizontal", scrollbarThumbHorizontal);
   }

   public void visitAttributeRequiresFadingEdge(String requiresFadingEdge) {
      this.visitAttribute("requiresFadingEdge", requiresFadingEdge);
   }

   public void visitAttributeKeyPreviewOffset(String keyPreviewOffset) {
      this.visitAttribute("keyPreviewOffset", keyPreviewOffset);
   }

   public void visitAttributeKeyOutputText(String keyOutputText) {
      this.visitAttribute("keyOutputText", keyOutputText);
   }

   public void visitAttributeKeyPreviewLayout(String keyPreviewLayout) {
      this.visitAttribute("keyPreviewLayout", keyPreviewLayout);
   }

   public void visitAttributeDial(String dial) {
      this.visitAttribute("dial", dial);
   }

   public void visitAttributeNextFocusForward(String nextFocusForward) {
      this.visitAttribute("nextFocusForward", nextFocusForward);
   }

   public void visitAttributeScrollbarAlwaysDrawHorizontalTrack(String scrollbarAlwaysDrawHorizontalTrack) {
      this.visitAttribute("scrollbarAlwaysDrawHorizontalTrack", scrollbarAlwaysDrawHorizontalTrack);
   }

   public void visitAttributeDrawableEnd(String drawableEnd) {
      this.visitAttribute("drawableEnd", drawableEnd);
   }

   public void visitAttributeLayoutWidth(String layoutWidth) {
      this.visitAttribute("layout_width", layoutWidth);
   }

   public void visitAttributeLayoutAlignBaseline(String layoutAlignBaseline) {
      this.visitAttribute("layout_alignBaseline", layoutAlignBaseline);
   }

   public void visitAttributeMeasureWithLargestChild(String measureWithLargestChild) {
      this.visitAttribute("measureWithLargestChild", measureWithLargestChild);
   }

   public void visitAttributeLayoutAlignLeft(String layoutAlignLeft) {
      this.visitAttribute("layout_alignLeft", layoutAlignLeft);
   }

   public void visitAttributeMax(String max) {
      this.visitAttribute("max", max);
   }

   public void visitAttributeSoundEffectsEnabled(String soundEffectsEnabled) {
      this.visitAttribute("soundEffectsEnabled", soundEffectsEnabled);
   }

   public void visitAttributeMinWidth(String minWidth) {
      this.visitAttribute("minWidth", minWidth);
   }

   public void visitAttributeTextIsSelectable(String textIsSelectable) {
      this.visitAttribute("textIsSelectable", textIsSelectable);
   }

   public void visitAttributeDescendantFocusability(String descendantFocusability) {
      this.visitAttribute("descendantFocusability", descendantFocusability);
   }

   public void visitAttributeAlignmentMode(String alignmentMode) {
      this.visitAttribute("alignmentMode", alignmentMode);
   }

   public void visitAttributeSubtypeExtraValue(String subtypeExtraValue) {
      this.visitAttribute("subtypeExtraValue", subtypeExtraValue);
   }

   public void visitAttributeTextColorHighlight(String textColorHighlight) {
      this.visitAttribute("textColorHighlight", textColorHighlight);
   }

   public void visitAttributeFocusableInTouchMode(String focusableInTouchMode) {
      this.visitAttribute("focusableInTouchMode", focusableInTouchMode);
   }

   public void visitAttributeChildIndicatorLeft(String childIndicatorLeft) {
      this.visitAttribute("childIndicatorLeft", childIndicatorLeft);
   }

   public void visitAttributeWeightSum(String weightSum) {
      this.visitAttribute("weightSum", weightSum);
   }

   public void visitAttributeScrollbarSize(String scrollbarSize) {
      this.visitAttribute("scrollbarSize", scrollbarSize);
   }

   public void visitAttributeSelectAllOnFocus(String selectAllOnFocus) {
      this.visitAttribute("selectAllOnFocus", selectAllOnFocus);
   }

   public void visitAttributeEditorExtras(String editorExtras) {
      this.visitAttribute("editorExtras", editorExtras);
   }

   public void visitAttributeFirstDayOfWeek(String firstDayOfWeek) {
      this.visitAttribute("firstDayOfWeek", firstDayOfWeek);
   }

   public void visitAttributeDrawableRight(String drawableRight) {
      this.visitAttribute("drawableRight", drawableRight);
   }

   public void visitAttributeWidth(String width) {
      this.visitAttribute("width", width);
   }

   public void visitAttributeMaxDate(String maxDate) {
      this.visitAttribute("maxDate", maxDate);
   }

   public void visitAttributeStretchColumns(String stretchColumns) {
      this.visitAttribute("stretchColumns", stretchColumns);
   }

   public void visitAttributeScrollbarFadeDuration(String scrollbarFadeDuration) {
      this.visitAttribute("scrollbarFadeDuration", scrollbarFadeDuration);
   }

   public void visitAttributeFadingEdgeLength(String fadingEdgeLength) {
      this.visitAttribute("fadingEdgeLength", fadingEdgeLength);
   }

   public void visitAttributeFlipInterval(String flipInterval) {
      this.visitAttribute("flipInterval", flipInterval);
   }

   public void visitAttributeCodes(String codes) {
      this.visitAttribute("codes", codes);
   }

   public void visitAttributeOnClick(String onClick) {
      this.visitAttribute("onClick", onClick);
   }

   public void visitAttributeFooterDividersEnabled(String footerDividersEnabled) {
      this.visitAttribute("footerDividersEnabled", footerDividersEnabled);
   }

   public void visitAttributeRating(String rating) {
      this.visitAttribute("rating", rating);
   }

   public void visitAttributeLayoutMarginLeft(String layoutMarginLeft) {
      this.visitAttribute("layout_marginLeft", layoutMarginLeft);
   }

   public void visitAttributeLayoutColumn(String layoutColumn) {
      this.visitAttribute("layout_column", layoutColumn);
   }

   public void visitAttributeScaleX(String scaleX) {
      this.visitAttribute("scaleX", scaleX);
   }

   public void visitAttributeMode(String mode) {
      this.visitAttribute("mode", mode);
   }

   public void visitAttributeLayoutAbove(String layoutAbove) {
      this.visitAttribute("layout_above", layoutAbove);
   }

   public void visitAttributeScaleY(String scaleY) {
      this.visitAttribute("scaleY", scaleY);
   }

   public void visitAttributePaddingBottom(String paddingBottom) {
      this.visitAttribute("paddingBottom", paddingBottom);
   }

   public void visitAttributeDividerPadding(String dividerPadding) {
      this.visitAttribute("dividerPadding", dividerPadding);
   }

   public void visitAttributeChecked(String checked) {
      this.visitAttribute("checked", checked);
   }

   public void visitAttributeInputType(String inputType) {
      this.visitAttribute("inputType", inputType);
   }

   public void visitAttributeTag(String tag) {
      this.visitAttribute("tag", tag);
   }

   public void visitAttributeKeepScreenOn(String keepScreenOn) {
      this.visitAttribute("keepScreenOn", keepScreenOn);
   }

   public void visitAttributeLinksClickable(String linksClickable) {
      this.visitAttribute("linksClickable", linksClickable);
   }

   public void visitAttributeFormat(String format) {
      this.visitAttribute("format", format);
   }

   public void visitAttributeIndicatorRight(String indicatorRight) {
      this.visitAttribute("indicatorRight", indicatorRight);
   }

   public void visitAttributeLayoutX(String layoutX) {
      this.visitAttribute("layout_x", layoutX);
   }

   public void visitAttributeLayoutY(String layoutY) {
      this.visitAttribute("layout_y", layoutY);
   }

   public void visitAttributeAutoStart(String autoStart) {
      this.visitAttribute("autoStart", autoStart);
   }

   public void visitAttributeLayoutMargin(String layoutMargin) {
      this.visitAttribute("layout_margin", layoutMargin);
   }

   public void visitAttributeKeyBackground(String keyBackground) {
      this.visitAttribute("keyBackground", keyBackground);
   }

   public void visitAttributeTextColorHint(String textColorHint) {
      this.visitAttribute("textColorHint", textColorHint);
   }

   public void visitAttributeEntries(String entries) {
      this.visitAttribute("entries", entries);
   }

   public void visitAttributeScaleType(String scaleType) {
      this.visitAttribute("scaleType", scaleType);
   }

   public void visitAttributeBackground(String background) {
      this.visitAttribute("background", background);
   }

   public void visitAttributeDrawingCacheQuality(String drawingCacheQuality) {
      this.visitAttribute("drawingCacheQuality", drawingCacheQuality);
   }

   public void visitAttributeChildIndicatorRight(String childIndicatorRight) {
      this.visitAttribute("childIndicatorRight", childIndicatorRight);
   }

   public void visitAttributeDropDownAnchor(String dropDownAnchor) {
      this.visitAttribute("dropDownAnchor", dropDownAnchor);
   }

   public void visitAttributeNextFocusDown(String nextFocusDown) {
      this.visitAttribute("nextFocusDown", nextFocusDown);
   }

   public void visitAttributeTextAllCaps(String textAllCaps) {
      this.visitAttribute("textAllCaps", textAllCaps);
   }

   public void visitAttributeLayoutMarginRight(String layoutMarginRight) {
      this.visitAttribute("layout_marginRight", layoutMarginRight);
   }

   public void visitAttributeMaxLength(String maxLength) {
      this.visitAttribute("maxLength", maxLength);
   }

   public void visitAttributeSmoothScrollbar(String smoothScrollbar) {
      this.visitAttribute("smoothScrollbar", smoothScrollbar);
   }

   public void visitAttributePersistentDrawingCache(String persistentDrawingCache) {
      this.visitAttribute("persistentDrawingCache", persistentDrawingCache);
   }

   public void visitAttributeFastScrollEnabled(String fastScrollEnabled) {
      this.visitAttribute("fastScrollEnabled", fastScrollEnabled);
   }

   public void visitAttributeDrawablePadding(String drawablePadding) {
      this.visitAttribute("drawablePadding", drawablePadding);
   }

   public void visitAttributeRowEdgeFlags(String rowEdgeFlags) {
      this.visitAttribute("rowEdgeFlags", rowEdgeFlags);
   }

   public void visitAttributeIsIndicator(String isIndicator) {
      this.visitAttribute("isIndicator", isIndicator);
   }

   public void visitAttributeStepSize(String stepSize) {
      this.visitAttribute("stepSize", stepSize);
   }

   public void visitAttributeNumeric(String numeric) {
      this.visitAttribute("numeric", numeric);
   }

   public void visitAttributeTextEditSideNoPasteWindowLayout(String textEditSideNoPasteWindowLayout) {
      this.visitAttribute("textEditSideNoPasteWindowLayout", textEditSideNoPasteWindowLayout);
   }

   public void visitAttributeDropDownHeight(String dropDownHeight) {
      this.visitAttribute("dropDownHeight", dropDownHeight);
   }

   public void visitAttributeTabStripRight(String tabStripRight) {
      this.visitAttribute("tabStripRight", tabStripRight);
   }

   public void visitAttributeImeSubtypeMode(String imeSubtypeMode) {
      this.visitAttribute("imeSubtypeMode", imeSubtypeMode);
   }

   public void visitAttributeUnfocusedMonthDateColor(String unfocusedMonthDateColor) {
      this.visitAttribute("unfocusedMonthDateColor", unfocusedMonthDateColor);
   }

   public void visitAttributeBaselineAligned(String baselineAligned) {
      this.visitAttribute("baselineAligned", baselineAligned);
   }

   public void visitAttributeContentDescription(String contentDescription) {
      this.visitAttribute("contentDescription", contentDescription);
   }

   public void visitAttributeBaselineAlignBottom(String baselineAlignBottom) {
      this.visitAttribute("baselineAlignBottom", baselineAlignBottom);
   }

   public void visitAttributeLayoutAlignParentBottom(String layoutAlignParentBottom) {
      this.visitAttribute("layout_alignParentBottom", layoutAlignParentBottom);
   }

   public void visitAttributeColumnWidth(String columnWidth) {
      this.visitAttribute("columnWidth", columnWidth);
   }

   public void visitAttributeIndeterminateBehavior(String indeterminateBehavior) {
      this.visitAttribute("indeterminateBehavior", indeterminateBehavior);
   }

   public void visitAttributeScrollingCache(String scrollingCache) {
      this.visitAttribute("scrollingCache", scrollingCache);
   }

   public void visitAttributeTrack(String track) {
      this.visitAttribute("track", track);
   }

   public void visitAttributeLayoutAlignParentRight(String layoutAlignParentRight) {
      this.visitAttribute("layout_alignParentRight", layoutAlignParentRight);
   }

   public void visitAttributeLayoutCenterVertical(String layoutCenterVertical) {
      this.visitAttribute("layout_centerVertical", layoutCenterVertical);
   }

   public void visitAttributePadding(String padding) {
      this.visitAttribute("padding", padding);
   }

   public void visitAttributeOrientation(String orientation) {
      this.visitAttribute("orientation", orientation);
   }

   public void visitAttributeLayoutCenterHorizontal(String layoutCenterHorizontal) {
      this.visitAttribute("layout_centerHorizontal", layoutCenterHorizontal);
   }

   public void visitAttributeRowOrderPreserved(String rowOrderPreserved) {
      this.visitAttribute("rowOrderPreserved", rowOrderPreserved);
   }

   public void visitAttributeSrc(String src) {
      this.visitAttribute("src", src);
   }

   public void visitAttributeEditable(String editable) {
      this.visitAttribute("editable", editable);
   }

   public void visitAttributeImeActionId(String imeActionId) {
      this.visitAttribute("imeActionId", imeActionId);
   }

   public void visitAttributeFadeEnabled(String fadeEnabled) {
      this.visitAttribute("fadeEnabled", fadeEnabled);
   }

   public void visitAttributeDrawableTop(String drawableTop) {
      this.visitAttribute("drawableTop", drawableTop);
   }

   public void visitAttributeColumnCount(String columnCount) {
      this.visitAttribute("columnCount", columnCount);
   }

   public void visitAttributeDividerHeight(String dividerHeight) {
      this.visitAttribute("dividerHeight", dividerHeight);
   }

   public void visitAttributeIsAuxiliary(String isAuxiliary) {
      this.visitAttribute("isAuxiliary", isAuxiliary);
   }

   public void visitAttributeIconPreview(String iconPreview) {
      this.visitAttribute("iconPreview", iconPreview);
   }

   public void visitAttributeAutoLink(String autoLink) {
      this.visitAttribute("autoLink", autoLink);
   }

   public void visitAttributeMeasureAllChildren(String measureAllChildren) {
      this.visitAttribute("measureAllChildren", measureAllChildren);
   }

   public void visitAttributeSubtypeLocale(String subtypeLocale) {
      this.visitAttribute("subtypeLocale", subtypeLocale);
   }

   public void visitAttributeInputMethod(String inputMethod) {
      this.visitAttribute("inputMethod", inputMethod);
   }

   public void visitAttributeScrollY(String scrollY) {
      this.visitAttribute("scrollY", scrollY);
   }

   public void visitAttributeKeyPreviewHeight(String keyPreviewHeight) {
      this.visitAttribute("keyPreviewHeight", keyPreviewHeight);
   }

   public void visitAttributeTextStyle(String textStyle) {
      this.visitAttribute("textStyle", textStyle);
   }

   public void visitAttributeScrollX(String scrollX) {
      this.visitAttribute("scrollX", scrollX);
   }

   public void visitAttributePopupCharacters(String popupCharacters) {
      this.visitAttribute("popupCharacters", popupCharacters);
   }
}
