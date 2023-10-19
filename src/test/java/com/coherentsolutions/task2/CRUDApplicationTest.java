package com.coherentsolutions.task2;

import com.coherentsolutions.task2.DatabaseService;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class CRUDApplicationTest {
    @Test
    public void testMockDatabaseService() {
        DatabaseService mockService = mock(DatabaseService.class);
        when(mockService.read()).thenReturn("MockData");

        assertEquals("MockData", mockService.read());
        verify(mockService).read();
    }
    // Other test methods
}

