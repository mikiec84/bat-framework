package it.unipi.di.acube.batframework.datasetPlugins;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import it.unipi.di.acube.batframework.problems.C2WDataset;
import it.unipi.di.acube.batframework.utils.AnnotationException;
import it.unipi.di.acube.batframework.utils.WikipediaInterface;


public class KDDDevelDatasetTest extends DatasetTestBase{

	@Override
	public C2WDataset build(WikipediaInterface i) throws AnnotationException, XPathExpressionException, ParserConfigurationException, SAXException, IOException {
		return DatasetBuilder.getKDDDevel(i);
	}

}
