package com.example.data.source.local.pref

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment

@RunWith(RobolectricTestRunner::class)
class PrefHelperImplTest {
    private lateinit var prefHelperImpl: PrefHelperImpl

    @Before
    fun setUp() {
        prefHelperImpl = PrefHelperImpl(RuntimeEnvironment.application)
    }


    @Test
    fun testGetAndSetFirstRun() {
        var firtRun = prefHelperImpl.getFirstRun()
        assertEquals(firtRun, true)

        prefHelperImpl.setFirstRun(false)
        firtRun = prefHelperImpl.getFirstRun()
        assertEquals(firtRun, false)

        prefHelperImpl.setFirstRun(true)
        firtRun = prefHelperImpl.getFirstRun()
        assertEquals(firtRun, true)
    }
}
