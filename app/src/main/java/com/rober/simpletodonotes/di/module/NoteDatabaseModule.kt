package com.rober.simpletodonotes.di.module

import android.app.Application
import com.rober.simpletodonotes.data.local.NoteDao
import com.rober.simpletodonotes.data.local.NoteDatabase
import com.rober.simpletodonotes.data.repository.NotesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NoteDatabaseModule {

    @Singleton
    @Provides
    fun provideNoteDatabase(application: Application): NoteDatabase = NoteDatabase.getInstance(application)

    @Singleton
    @Provides
    fun provideNoteDao(database: NoteDatabase): NoteDao = database.getNoteDao()
}