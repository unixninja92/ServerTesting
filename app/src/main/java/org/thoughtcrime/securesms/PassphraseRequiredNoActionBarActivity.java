package org.thoughtcrime.securesms;

import android.os.Bundle;

import org.thoughtcrime.securesms.crypto.MasterSecret;

import info.guardianproject.onionkit.ui.OrbotHelper;

public class PassphraseRequiredNoActionBarActivity extends BaseActivity implements PassphraseRequiredActivity {

  private final PassphraseRequiredMixin delegate = new PassphraseRequiredMixin();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    delegate.onCreate(this);
  }

  @Override
  protected void onResume() {
    super.onResume();

    OrbotHelper oc = new OrbotHelper(this);
    if (!oc.isOrbotInstalled())
      oc.promptToInstall(this);
    else if (!oc.isOrbotRunning())
      oc.requestOrbotStart(this);

      delegate.onResume(this);
  }

  @Override
  protected void onPause() {
    super.onPause();
    delegate.onPause(this);
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    delegate.onDestroy(this);
  }

  @Override
  public void onMasterSecretCleared() {
    finish();
  }

  @Override
  public void onNewMasterSecret(MasterSecret masterSecret) {}
}
