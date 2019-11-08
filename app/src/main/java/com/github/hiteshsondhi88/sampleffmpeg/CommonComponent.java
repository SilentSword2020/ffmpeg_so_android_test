package com.github.hiteshsondhi88.sampleffmpeg;

import javax.inject.Singleton;

import dagger.Component;

@ActivityScope
@Singleton
@Component(modules = DaggerDependencyModule.class)
public interface CommonComponent {
    void inject(Home activity);
}