package com.rxjava2.android.samples.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rxjava2.android.samples.R;
import com.rxjava2.android.samples.subjects.AsyncSubjectExampleActivity;
import com.rxjava2.android.samples.subjects.BehaviorSubjectExampleActivity;
import com.rxjava2.android.samples.transform.BufferExampleActivity;
import com.rxjava2.android.samples.observabletypes.CompletableObserverExampleActivity;
import com.rxjava2.android.samples.combine.ConcatExampleActivity;
import com.rxjava2.android.samples.filtering.DebounceExampleActivity;
import com.rxjava2.android.samples.create.DeferExampleActivity;
import com.rxjava2.android.samples.utility.DelayExampleActivity;
import com.rxjava2.android.samples.ui.operators.DisposableExampleActivity;
import com.rxjava2.android.samples.filtering.DistinctExampleActivity;
import com.rxjava2.android.samples.filtering.FilterExampleActivity;
import com.rxjava2.android.samples.observabletypes.FlowableExampleActivity;
import com.rxjava2.android.samples.create.IntervalExampleActivity;
import com.rxjava2.android.samples.ui.operators.LastOperatorExampleActivity;
import com.rxjava2.android.samples.transform.MapExampleActivity;
import com.rxjava2.android.samples.combine.MergeExampleActivity;
import com.rxjava2.android.samples.subjects.PublishSubjectExampleActivity;
import com.rxjava2.android.samples.ui.operators.ReduceExampleActivity;
import com.rxjava2.android.samples.ui.operators.ReplayExampleActivity;
import com.rxjava2.android.samples.subjects.ReplaySubjectExampleActivity;
import com.rxjava2.android.samples.ui.operators.ScanExampleActivity;
import com.rxjava2.android.samples.ui.operators.SimpleExampleActivity;
import com.rxjava2.android.samples.observabletypes.SingleObserverExampleActivity;
import com.rxjava2.android.samples.filtering.SkipExampleActivity;
import com.rxjava2.android.samples.transform.SwitchMapExampleActivity;
import com.rxjava2.android.samples.filtering.TakeExampleActivity;
import com.rxjava2.android.samples.filtering.TakeUntilExampleActivity;
import com.rxjava2.android.samples.filtering.TakeWhileExampleActivity;
import com.rxjava2.android.samples.ui.operators.ThrottleFirstExampleActivity;
import com.rxjava2.android.samples.ui.operators.ThrottleLastExampleActivity;
import com.rxjava2.android.samples.create.TimerExampleActivity;
import com.rxjava2.android.samples.ui.operators.WindowExampleActivity;
import com.rxjava2.android.samples.combine.ZipExampleActivity;

import androidx.appcompat.app.AppCompatActivity;

public class OperatorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operators);
    }

    public void startSimpleActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, SimpleExampleActivity.class));
    }

    public void startMapActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, MapExampleActivity.class));
    }

    public void startZipActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ZipExampleActivity.class));
    }

    public void startDisposableActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, DisposableExampleActivity.class));
    }

    public void startTakeActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, TakeExampleActivity.class));
    }

    public void startTimerActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, TimerExampleActivity.class));
    }

    public void startIntervalActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, IntervalExampleActivity.class));
    }

    public void startSingleObserverActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, SingleObserverExampleActivity.class));
    }

    public void startCompletableObserverActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, CompletableObserverExampleActivity.class));
    }

    public void startFlowableActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, FlowableExampleActivity.class));
    }

    public void startReduceActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ReduceExampleActivity.class));
    }

    public void startBufferActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, BufferExampleActivity.class));
    }

    public void startFilterActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, FilterExampleActivity.class));
    }

    public void startSkipActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, SkipExampleActivity.class));
    }

    public void startScanActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ScanExampleActivity.class));
    }

    public void startReplayActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ReplayExampleActivity.class));
    }

    public void startConcatActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ConcatExampleActivity.class));
    }

    public void startMergeActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, MergeExampleActivity.class));
    }

    public void startDeferActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, DeferExampleActivity.class));
    }

    public void startDistinctActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, DistinctExampleActivity.class));
    }

    public void startLastOperatorActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, LastOperatorExampleActivity.class));
    }

    public void startReplaySubjectActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ReplaySubjectExampleActivity.class));
    }

    public void startPublishSubjectActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, PublishSubjectExampleActivity.class));
    }

    public void startBehaviorSubjectActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, BehaviorSubjectExampleActivity.class));
    }

    public void startAsyncSubjectActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, AsyncSubjectExampleActivity.class));
    }

    public void startThrottleFirstActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this,ThrottleFirstExampleActivity.class));
    }

    public void startThrottleLastActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ThrottleLastExampleActivity.class));
    }

    public void startDebounceActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, DebounceExampleActivity.class));
    }

    public void startWindowActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this,WindowExampleActivity.class));
    }

    public void startDelayActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this,DelayExampleActivity.class));
    }

    public void startSwitchMapActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, SwitchMapExampleActivity.class));
    }

    public void startTakeWhileActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, TakeWhileExampleActivity.class));
    }

    public void startTakeUntilActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, TakeUntilExampleActivity.class));
    }
}
