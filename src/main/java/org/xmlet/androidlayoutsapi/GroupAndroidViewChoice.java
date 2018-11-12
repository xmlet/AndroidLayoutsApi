package org.xmlet.androidlayoutsapi;

public interface GroupAndroidViewChoice<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default View<T> view() {
      return new View(this.self());
   }

   default GLSurfaceView<T> gLSurfaceView() {
      return new GLSurfaceView(this.self());
   }

   default AdapterView<T> adapterView() {
      return new AdapterView(this.self());
   }

   default AdapterViewAnimator<T> adapterViewAnimator() {
      return new AdapterViewAnimator(this.self());
   }

   default AutoCompleteTextView<T> autoCompleteTextView() {
      return new AutoCompleteTextView(this.self());
   }

   default MediaController<T> mediaController() {
      return new MediaController(this.self());
   }

   default TextView<T> textView() {
      return new TextView(this.self());
   }

   default FragmentBreadCrumbs<T> fragmentBreadCrumbs() {
      return new FragmentBreadCrumbs(this.self());
   }

   default AppWidgetHostView<T> appWidgetHostView() {
      return new AppWidgetHostView(this.self());
   }

   default GestureOverlayView<T> gestureOverlayView() {
      return new GestureOverlayView(this.self());
   }

   default ExtractEditText<T> extractEditText() {
      return new ExtractEditText(this.self());
   }

   default KeyboardView<T> keyboardView() {
      return new KeyboardView(this.self());
   }

   default RSSurfaceView<T> rSSurfaceView() {
      return new RSSurfaceView(this.self());
   }

   default RSTextureView<T> rSTextureView() {
      return new RSTextureView(this.self());
   }

   default SurfaceView<T> surfaceView() {
      return new SurfaceView(this.self());
   }

   default TextureView<T> textureView() {
      return new TextureView(this.self());
   }

   default ViewGroup<T> viewGroup() {
      return new ViewGroup(this.self());
   }

   default ViewStub<T> viewStub() {
      return new ViewStub(this.self());
   }

   default WebView<T> webView() {
      return new WebView(this.self());
   }

   default AbsListView<T> absListView() {
      return new AbsListView(this.self());
   }

   default AbsSeekBar<T> absSeekBar() {
      return new AbsSeekBar(this.self());
   }

   default AbsSpinner<T> absSpinner() {
      return new AbsSpinner(this.self());
   }

   default AbsoluteLayout<T> absoluteLayout() {
      return new AbsoluteLayout(this.self());
   }

   default AdapterViewFlipper<T> adapterViewFlipper() {
      return new AdapterViewFlipper(this.self());
   }

   default AnalogClock<T> analogClock() {
      return new AnalogClock(this.self());
   }

   default Button<T> button() {
      return new Button(this.self());
   }

   default CalendarView<T> calendarView() {
      return new CalendarView(this.self());
   }

   default CheckBox<T> checkBox() {
      return new CheckBox(this.self());
   }

   default CheckedTextView<T> checkedTextView() {
      return new CheckedTextView(this.self());
   }

   default Chronometer<T> chronometer() {
      return new Chronometer(this.self());
   }

   default CompoundButton<T> compoundButton() {
      return new CompoundButton(this.self());
   }

   default DatePicker<T> datePicker() {
      return new DatePicker(this.self());
   }

   default DialerFilter<T> dialerFilter() {
      return new DialerFilter(this.self());
   }

   default DigitalClock<T> digitalClock() {
      return new DigitalClock(this.self());
   }

   default EditText<T> editText() {
      return new EditText(this.self());
   }

   default ExpandableListView<T> expandableListView() {
      return new ExpandableListView(this.self());
   }

   default FrameLayout<T> frameLayout() {
      return new FrameLayout(this.self());
   }

   default Gallery<T> gallery() {
      return new Gallery(this.self());
   }

   default GridLayout<T> gridLayout() {
      return new GridLayout(this.self());
   }

   default GridView<T> gridView() {
      return new GridView(this.self());
   }

   default HorizontalScrollView<T> horizontalScrollView() {
      return new HorizontalScrollView(this.self());
   }

   default ImageButton<T> imageButton() {
      return new ImageButton(this.self());
   }

   default ImageSwitcher<T> imageSwitcher() {
      return new ImageSwitcher(this.self());
   }

   default ImageView<T> imageView() {
      return new ImageView(this.self());
   }

   default LinearLayout<T> linearLayout() {
      return new LinearLayout(this.self());
   }

   default ListView<T> listView() {
      return new ListView(this.self());
   }

   default MultiAutoCompleteTextView<T> multiAutoCompleteTextView() {
      return new MultiAutoCompleteTextView(this.self());
   }

   default NumberPicker<T> numberPicker() {
      return new NumberPicker(this.self());
   }

   default ProgressBar<T> progressBar() {
      return new ProgressBar(this.self());
   }

   default QuickContactBadge<T> quickContactBadge() {
      return new QuickContactBadge(this.self());
   }

   default RadioButton<T> radioButton() {
      return new RadioButton(this.self());
   }

   default RadioGroup<T> radioGroup() {
      return new RadioGroup(this.self());
   }

   default RatingBar<T> ratingBar() {
      return new RatingBar(this.self());
   }

   default RelativeLayout<T> relativeLayout() {
      return new RelativeLayout(this.self());
   }

   default ScrollView<T> scrollView() {
      return new ScrollView(this.self());
   }

   default SearchView<T> searchView() {
      return new SearchView(this.self());
   }

   default SeekBar<T> seekBar() {
      return new SeekBar(this.self());
   }

   default SlidingDrawer<T> slidingDrawer() {
      return new SlidingDrawer(this.self());
   }

   default Space<T> space() {
      return new Space(this.self());
   }

   default Spinner<T> spinner() {
      return new Spinner(this.self());
   }

   default StackView<T> stackView() {
      return new StackView(this.self());
   }

   default Switchh<T> switchh() {
      return new Switchh(this.self());
   }

   default TabHost<T> tabHost() {
      return new TabHost(this.self());
   }

   default TabWidget<T> tabWidget() {
      return new TabWidget(this.self());
   }

   default TableLayout<T> tableLayout() {
      return new TableLayout(this.self());
   }

   default TableRow<T> tableRow() {
      return new TableRow(this.self());
   }

   default TextSwitcher<T> textSwitcher() {
      return new TextSwitcher(this.self());
   }

   default TimePicker<T> timePicker() {
      return new TimePicker(this.self());
   }

   default ToggleButton<T> toggleButton() {
      return new ToggleButton(this.self());
   }

   default TwoLineListItem<T> twoLineListItem() {
      return new TwoLineListItem(this.self());
   }

   default VideoView<T> videoView() {
      return new VideoView(this.self());
   }

   default ViewAnimator<T> viewAnimator() {
      return new ViewAnimator(this.self());
   }

   default ViewFlipper<T> viewFlipper() {
      return new ViewFlipper(this.self());
   }

   default ViewSwitcher<T> viewSwitcher() {
      return new ViewSwitcher(this.self());
   }

   default ZoomButton<T> zoomButton() {
      return new ZoomButton(this.self());
   }

   default ZoomControls<T> zoomControls() {
      return new ZoomControls(this.self());
   }
}
