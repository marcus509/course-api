package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	
	private List<Topic> topics = Arrays.asList(
			new Topic("Spring", "Spring Framework", "Spring Framework Description"),
			new Topic("Java", "Java Framework", "Java Framework Description"),
			new Topic("JS", "JS Framework", "JS Framework Description")
		);
	
	public List<Topic> getAllTopics () {
		return topics;
	}
	
	public Topic getTopic (String id) {
		return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
	}
	
	
}
