package com.aya.spring.springdemomaven.web;

import com.aya.spring.springdemomaven.model.StackoverflowWebsite;
import com.aya.spring.springdemomaven.service.StackoverflowService;
import com.google.common.collect.ImmutableList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class StackoverflowControllerTest {

    @Mock
    private StackoverflowService stackoverflowService;

    @InjectMocks
    private StackoverflowController sut;


    @Test
    public void getListOfProviders() throws Exception {
        // prepare
        when(stackoverflowService.findAll()).thenReturn(ImmutableList.of());

        // testing
        List<StackoverflowWebsite> listOfProviders = sut.getListOfProviders();

        // validation
        verify(stackoverflowService).findAll();
    }

}